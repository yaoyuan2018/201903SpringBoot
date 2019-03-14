package ch3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 15:11
 * @mail: yy494818027@163.com
 * @Description:
 */
@Configuration
@ComponentScan("ch3")
@EnableAspectJAutoProxy         //开启Spring对AspectJ代理的支持

public class AopConfig {
}
