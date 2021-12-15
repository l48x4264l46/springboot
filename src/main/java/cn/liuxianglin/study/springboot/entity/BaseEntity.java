package cn.liuxianglin.study.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 基础实体类
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/14 10:55
 * @since 1.0
 */
@Getter
@Setter
public abstract class BaseEntity implements Serializable {
    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 创建人
     */
    private String creatorId;

    /**
     * 创建人时间
     */
    private LocalDateTime creationTime;

    /**
     * 更新人
     */
    private String updaterId;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 删除标记
     */
    private Integer del;
}
