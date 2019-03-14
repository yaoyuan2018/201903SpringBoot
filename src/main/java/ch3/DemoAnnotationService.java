package ch3;

import org.springframework.stereotype.Service;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 14:58
 * @mail: yy494818027@163.com
 * @Description: 使用注解的被拦截类
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){}
}
