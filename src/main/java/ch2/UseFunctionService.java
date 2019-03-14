package ch2;

/**
 * @Author: Y_uan
 * @Date: 2019/3/14 14:37
 * @mail: yy494818027@163.com
 * @Description:
 */
//此处没有使用@Service声明Bean
public class UseFunctionService {

    //此处没有使用@Autowired注解注入Bean
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
