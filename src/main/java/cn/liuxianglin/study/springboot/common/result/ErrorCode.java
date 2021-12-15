package cn.liuxianglin.study.springboot.common.result;

/**
 * <p>
 *
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/14 16:08
 * @since 1.0
 */
public enum ErrorCode {
    SUCCESS(200, "成功"), SYS_ERROR(500, "系统异常"), PARAM_ERROR(400, "参数错误");

    private final int code;
    private final String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
