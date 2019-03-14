package ch3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 15:00
 * @mail: yy494818027@163.com
 * @Description: 切面
 */
@Aspect         //声明一个切面
@Component      //让此切面成为Spring容器管理的Bean
public class LogAspect {
    //声明切点
    @Pointcut("@annotation(ch3.Action)")
    public void annotationPointCut(){};

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截" + action.name());    //通过反射可获得注解上的属性，然后做日志记录相关的操作，下面的相同。
    }

    @Before("execution(*ch3.DemoMethodService.*(..))")  //声明一个建言，此建言直接使用拦截规则作为参数。
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截，" + method.getName());
    }
}
