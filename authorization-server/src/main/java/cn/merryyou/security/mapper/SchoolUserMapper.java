package cn.merryyou.security.mapper;


import cn.merryyou.security.model.SchoolUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 学校用户表 Mapper 接口
 * </p>
 *
 * @author machunlin
 * @date 2019-06-12
 */
@Mapper
public interface SchoolUserMapper extends BaseMapper<SchoolUser> {
    SchoolUser getByAccount(@Param("account") String account);
}
