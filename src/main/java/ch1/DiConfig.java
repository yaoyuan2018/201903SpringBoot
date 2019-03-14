package ch1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 14:18
 * @mail: yy494818027@163.com
 * @Description:
 */

@Configuration  //声明当前类是一个配置类
@ComponentScan("ch1")  //自动扫描包名下所有使用@Service、@Component、@Repository和@Controller的类，并注册为Bean
public class DiConfig {
}
