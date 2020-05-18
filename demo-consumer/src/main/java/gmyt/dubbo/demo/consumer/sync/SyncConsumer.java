package gmyt.dubbo.demo.consumer.sync;

import gmyt.dubbo.demo.consumer.AbstractConsumer;
import org.apache.dubbo.config.ReferenceConfig;

/**
 * 消费端同步调用
 *
 * @author yitian
 * @date 2020/5/18 16:36
 */
public class SyncConsumer extends AbstractConsumer {


    public SyncConsumer(ReferenceConfig referenceConfig) {
        super(referenceConfig);
    }

    @Override
    public boolean hanlder(String s){
        System.out.println("同步调用结果："+getService().sayHello(s));
        return true;
    }




}
