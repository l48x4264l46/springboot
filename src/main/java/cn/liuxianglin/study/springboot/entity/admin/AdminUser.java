package cn.liuxianglin.study.springboot.entity.admin;

import cn.liuxianglin.study.springboot.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/15 16:24
 * @since 1.0
 */
@Data
@TableName("t_admin_user")
@EqualsAndHashCode(callSuper = true)
public class AdminUser extends BaseEntity {
    /**
     * 名称
     */
    private String name;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 账户
     */
    private String account;

    /**
     * 盐
     */
    private String salt;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 是否是管理员
     */
    private Integer adminState;
}
