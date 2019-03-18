package application_event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: Y_uan
 * @Date: 2019/3/18 10:58
 * @mail: yy494818027@163.com
 * @Description:
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}
