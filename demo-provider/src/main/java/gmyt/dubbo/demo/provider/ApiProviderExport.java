package gmyt.dubbo.demo.provider;

import gmyt.dubbo.demo.api.DemoService;
import gmyt.dubbo.demo.provider.service.DemoServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务暴露
 *
 * @author yitian
 * @date 2020/5/18 13:58
 */
public class ApiProviderExport {

    public static void main(String[] args) throws IOException {
        //1.创建ServiceConfig实例
        ServiceConfig<DemoService> serviceConfig = new ServiceConfig<>();
        //2.设置服务应用配置
        serviceConfig.setApplication(new ApplicationConfig("first-demo-provider"));
        //3.设置注册中心
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        serviceConfig.setRegistry(registryConfig);
        //4.注册接口和实现类
        serviceConfig.setInterface(DemoService.class);
        serviceConfig.setRef(new DemoServiceImpl());
        //5.设置分组和版本
        serviceConfig.setGroup("demo_test");
        serviceConfig.setVersion("1.0.0");


        //暴露服务
        serviceConfig.export();
        System.out.println("执行成功");
        System.in.read();

        ConcurrentHashMap<String,Object> c = new ConcurrentHashMap<>(10);

    }

}
