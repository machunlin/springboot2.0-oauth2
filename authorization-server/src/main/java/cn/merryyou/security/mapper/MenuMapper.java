package cn.merryyou.security.mapper;


import cn.merryyou.security.model.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author machunlin
 * @date 2019-06-12
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> queryByUserId(@Param("userId") Long userId, @Param("type") Integer type);
}
