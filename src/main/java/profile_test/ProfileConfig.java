package profile_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 16:57
 * @mail: yy494818027@163.com
 * @Description:
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")     //Profile为dev时实例化devDemoBean。
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod")    //Profile为prod时实例化prodDemoBean。
    public DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }
}
