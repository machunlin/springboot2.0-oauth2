package com.auge.security.jwt;

import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

/**
 * 扩展返回的token信息。
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class MyJwtTokenEnhancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        //扩展返回的token
        //Map<String, Object> info = new HashMap<>();
        // info.put("blog", "https://longfeizheng.github.io/");
        // ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
        return accessToken;
    }
}
