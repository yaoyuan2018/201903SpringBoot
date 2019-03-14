package ch1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 14:15
 * @mail: yy494818027@163.com
 * @Description:
 */
@Service    //声明当前UseFunctionService类是Spring管理的一个Bean。
public class UseFunctionService {
    //使用@Autowired将FunctionService的实体Bean注入到UseFunctionService中
    // 让UseFunctionService具备FunctionService的功能
    @Autowired
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
