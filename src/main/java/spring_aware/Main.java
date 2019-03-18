package spring_aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Y_uan
 * @Date: 2019/3/18 11:31
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService awareService = context.getBean(AwareService.class);

        awareService.outputResult();
        context.close();
    }
}
