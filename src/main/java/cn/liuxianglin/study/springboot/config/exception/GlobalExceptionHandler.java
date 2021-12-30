package cn.liuxianglin.study.springboot.config.exception;

import cn.liuxianglin.study.springboot.common.result.ErrorCode;
import cn.liuxianglin.study.springboot.common.result.JsonResult;
import cn.liuxianglin.study.springboot.excepotion.BusinessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 全局异常处理
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/29 14:11
 * @since 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(BusinessException.class)
    public JsonResult<Void> businessExceptionHandler(HttpServletRequest httpServletRequest, BusinessException e) {
        JsonResult<Void> result = new JsonResult<>();

        result.setCode(ErrorCode.PARAM_ERROR.getCode());
        result.setMsg(e.getMsg());

        return result;
    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public JsonResult<Void> unCatchExceptionHandler(HttpServletRequest httpServletRequest, BusinessException e) {
        JsonResult<Void> result = new JsonResult<>();

        result.setCode(ErrorCode.SYS_ERROR.getCode());
        result.setMsg("系统异常，请联系软件供应商！");

        return result;
    }
}
