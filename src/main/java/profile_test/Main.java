package profile_test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Y_uan
 * @Date: 2019/3/15 11:49
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //先将活动的Profile设置为prod
        context.getEnvironment().setActiveProfiles("prod");

        //后置注册Bean配置类，不然会报Bean未定义的错误。
        context.register(ProfileConfig.class);
        //刷新容器。
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
