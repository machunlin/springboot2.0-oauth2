package cn.merryyou.security.controller;

import cn.merryyou.security.model.SchoolUser;
import cn.merryyou.security.properties.OAuth2Properties;
import cn.merryyou.security.service.SchoolUserService;
import cn.merryyou.security.utils.JsonUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.Principal;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private OAuth2Properties oAuth2Properties;
    @Autowired
    private SchoolUserService schoolUserService;

    @GetMapping("/userJwt")
    public Object getCurrentUserJwt(Authentication authentication, HttpServletRequest request) throws UnsupportedEncodingException {
        log.info("【SecurityOauth2Application】 getCurrentUserJwt authentication={}", JsonUtil.toJson(authentication));

        String header = request.getHeader("Authorization");
        String token = StringUtils.substringAfter(header, "bearer ");

        Claims claims = Jwts.parser().setSigningKey(oAuth2Properties.getJwtSigningKey().getBytes("UTF-8")).parseClaimsJws(token).getBody();
        String blog = (String) claims.get("blog");
        log.info("【SecurityOauth2Application】 getCurrentUser1 blog={}", blog);

        return authentication;
    }

    @GetMapping("/userRedis")
    public Object getCurrentUserRedis(Authentication authentication) {
        log.info("【SecurityOauth2Application】 getCurrentUserRedis authentication={}", JsonUtil.toJson(authentication));
        return authentication;
    }

    @GetMapping("/user/me")
    public Principal user(Principal user) {
        return user;
    }

    @GetMapping("/test/getById")
    public SchoolUser getById(@RequestParam("id") Long id) {
        return schoolUserService.getById(id);
    }

    @RequestMapping("/home")
    public ModelAndView home(String msg) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("msg", msg);
        return mv;
    }
}
