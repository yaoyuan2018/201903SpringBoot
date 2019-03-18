package application_event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Y_uan
 * @Date: 2019/3/18 11:01
 * @mail: yy494818027@163.com
 * @Description: 监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {   //实现接口，并指定监听的事件类型
    public void onApplicationEvent(DemoEvent demoEvent) {
        //使用onApplicationEvent方法对消息进行接受处理。
        String msg = demoEvent.getMsg();

        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息：" + msg);
    }
}
