package cn.liuxianglin.study.springboot.common.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 返回值
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/14 15:39
 * @since 1.0
 */
@ApiModel(value = "json返回对象")
public class JsonResult<T> {
    @ApiModelProperty(value = "状态码")
    private int code;

    @ApiModelProperty(value = "消息")
    private String msg;

    @ApiModelProperty(value = "数据")
    private T data;

    public JsonResult() {
    }

    public JsonResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> JsonResult<T> success(T data) {
        ErrorCode successEnum = ErrorCode.SUCCESS;
        return new JsonResult<>(successEnum.getCode(), successEnum.getMsg(), data);
    }

    public static <T> JsonResult<T> error(String msg) {
        ErrorCode errorEnum = ErrorCode.PARAM_ERROR;
        return new JsonResult<>(errorEnum.getCode(), msg, null);
    }

    public static <T> JsonResult<T> error(ErrorCode errorCode, T data) {
        return new JsonResult<>(errorCode.getCode(), errorCode.getMsg(), data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
