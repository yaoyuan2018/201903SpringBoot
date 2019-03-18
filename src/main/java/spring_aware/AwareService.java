package spring_aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;


/**
 * @Author: Y_uan
 * @Date: 2019/3/18 11:22
 * @mail: yy494818027@163.com
 * @Description:
 */

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    //实现BeanNameAware、ResourceLoaderAware接口，获得Bean名称和资源加载的服务。
    private String beanName;
    private ResourceLoader loader;

    public void setBeanName(String name) {
        //实现BeanNameAware需重写setBeanName方法。
        this.beanName = name;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        //实现ResourceLoaderAware需重写setResourceLoader
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名称为：" + beanName);
        Resource resource = loader.getResource("classpath:test.txt");
        try {
            System.out.println("ResoureLoader加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
