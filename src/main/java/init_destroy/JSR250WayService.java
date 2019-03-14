package init_destroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 16:37
 * @mail: yy494818027@163.com
 * @Description:
 */
public class JSR250WayService {
    @PostConstruct          //在构造桉树执行完之后执行
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy             //在Bean销毁之前执行
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
