package org.zhoup.service.log;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.zhoup.service.utils.HttpContextUtils;
import org.zhoup.service.utils.IPUtils;

import java.lang.reflect.Method;
import java.util.Date;

@Aspect
@Component
public class MyLogAdvice {

    private Logger logger = Logger.getLogger(MyLogAdvice.class);

    @Pointcut("@annotation(org.zhoup.service.log.MyLog)")
    public void myPointcut(){

    }

    //开发通知
    @AfterReturning(pointcut = "myPointcut()")
    public void myafterRet(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        MyLog annotation = method.getAnnotation(MyLog.class);
        String operation = null;
        if(annotation!=null){
            operation = annotation.value();
        }
        String ip = IPUtils.getIpAddr(HttpContextUtils.getHttpServletRequest());
        Object[] args = joinPoint.getArgs();
        String toJSONString = JSON.toJSONString(args);
        String methodName = joinPoint.getTarget().getClass().getName() + "." + method.getName();
        logger.info(new Date()+"|"+operation+"|"+ip+"|"+toJSONString+"|"+methodName);

    }

}
