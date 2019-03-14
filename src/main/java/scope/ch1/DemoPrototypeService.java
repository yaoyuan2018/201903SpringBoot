package scope.ch1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 15:32
 * @mail: yy494818027@163.com
 * @Description: 编写Prototype的Bean
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
