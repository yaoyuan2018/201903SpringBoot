package init_destroy;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 16:35
 * @mail: yy494818027@163.com
 * @Description:
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
