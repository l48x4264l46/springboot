package cn.liuxianglin.study.springboot.entity.admin;

import cn.liuxianglin.study.springboot.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户角色
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/15 16:34
 * @since 1.0
 */
@Data
@TableName("t_admin_role_user")
@EqualsAndHashCode(callSuper = true)
public class AdminRoleUser extends BaseEntity {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 角色id
     */
    private String roleId;
}
