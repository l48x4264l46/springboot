package cn.liuxianglin.study.springboot.excepotion;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 业务异常
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/29 14:10
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessException extends RuntimeException {
    /**
     * 错误代码
     */
    private final Integer code;

    /**
     * 错误信息
     */
    private final String msg;

    public BusinessException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
