package ch2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 14:45
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.SayHello("java config"));

        context.close();
    }
}
