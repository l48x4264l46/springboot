package cn.liuxianglin.study.springboot.dao.admin;

import cn.liuxianglin.study.springboot.dao.BaseDao;
import cn.liuxianglin.study.springboot.entity.admin.AdminUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  用户dao
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/15 16:38
 * @since 1.0
 */
@Mapper
public interface AdminUserDao extends BaseDao<AdminUser> {
}
