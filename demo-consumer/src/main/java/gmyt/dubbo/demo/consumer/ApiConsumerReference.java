package gmyt.dubbo.demo.consumer;

import gmyt.dubbo.demo.api.DemoService;
import gmyt.dubbo.demo.consumer.async.AsyncConsumer;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

/**
 * 服务引用
 *
 * @author yitian
 * @date 2020/5/18 15:41
 */
public class ApiConsumerReference {

    public static void main(String[] args) throws InterruptedException {
        //1.实例化服务引用实例
        ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<>();
        //2.设置应用程序信息
        referenceConfig.setApplication(new ApplicationConfig("first-demo-consumer"));
        //3.设置注册中心
        RegistryConfig registryConfig = new RegistryConfig("zookeeper://127.0.0.1:2181");
        referenceConfig.setRegistry(registryConfig);
        //4.设置接口
        referenceConfig.setInterface(DemoService.class);
        referenceConfig.setTimeout(5000);
        //5.设置版本、分组
        referenceConfig.setVersion("1.0.0");
        referenceConfig.setGroup("demo_test");

//        new SyncConsumer(referenceConfig).hanlder("SyncConsumer");

        new AsyncConsumer(referenceConfig).hanlder("AsyncConsumer");


        Thread.currentThread().join();

    }

}
