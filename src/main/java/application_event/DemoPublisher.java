package application_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: Y_uan
 * @Date: 2019/3/18 11:04
 * @mail: yy494818027@163.com
 * @Description: 发布器
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;  //注入ApplicationContext用来发布事件

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
        //使用ApplicatioContext的publishEvent方法来发布
    }
}
