package ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 14:41
 * @mail: yy494818027@163.com
 * @Description:
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());

        return useFunctionService;
    }
}
