package cn.liuxianglin.study.springboot.entity.admin;

import cn.liuxianglin.study.springboot.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 角色
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/15 16:19
 * @since 1.0
 */

@Data
@TableName("t_admin_role")
@EqualsAndHashCode(callSuper = true)
public class AdminRole extends BaseEntity {
    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 是否是管理角色
     */
    private Integer adminState;

    /**
     * 备注
     */
    private String remark;
}
