package org.zhoup.service.exception;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhoup.service.utils.R;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RExceptionHandler {

    //内部异常
    @ExceptionHandler(RException.class)
    @ResponseBody
    public R rException(RException rException){
        R r = new R();
        r.put("code",500);
        r.put("msg",rException.getMsc());
        return r;
    }

    //全局异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R allException(Exception exception){
        R r = new R();
        r.put("code",500);
        r.put("msg","系统内部异常，请联系管理员");
        return r;
    }
    //权限异常
    @ExceptionHandler(AuthorizationException.class)
    public String authorizationException(AuthorizationException authorizationException){
        return "unauthorized.html";
    }


}
