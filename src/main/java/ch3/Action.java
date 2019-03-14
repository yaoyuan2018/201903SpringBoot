package ch3;

import java.lang.annotation.*;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 14:56
 * @mail: yy494818027@163.com
 * @Description: 拦截规则的注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
