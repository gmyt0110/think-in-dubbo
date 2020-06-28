package gmyt.dubbo.demo.consumer;

import gmyt.dubbo.demo.api.DemoService;
import org.apache.dubbo.config.ReferenceConfig;

/**
 * 消费端
 *
 * @author yitian
 * @date 2020/5/18 16:46
 */
public abstract class AbstractConsumer<T> {

    protected ReferenceConfig<T> referenceConfig;


    public AbstractConsumer(ReferenceConfig<T> referenceConfig){
        this.referenceConfig = referenceConfig;
    }

    public DemoService getService(){
        return (DemoService)referenceConfig.get();
    }

    /**
     * 各场景处理器
     * @param s
     * @return
     */
    protected abstract boolean hanlder(String s);
}
