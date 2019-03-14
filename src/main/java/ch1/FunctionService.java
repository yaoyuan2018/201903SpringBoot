package ch1;

import org.springframework.stereotype.Service;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 14:14
 * @mail: yy494818027@163.com
 * @Description:
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + "!";
    }
}
