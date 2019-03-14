package ch4_el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 15:49
 * @mail: yy494818027@163.com
 * @Description:
 */
@Service
public class DemoService {
    @Value("其他类的属性")
    private String another;

    public String getAnother(){
        return another;
    }
    public void setAnother(String another){
        this.another = another;
    }
}
