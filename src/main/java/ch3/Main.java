package ch3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 15:20
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();

        context.close();
    }
}
