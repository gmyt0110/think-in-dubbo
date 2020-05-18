package gmyt.dubbo.demo.consumer.async;

import gmyt.dubbo.demo.consumer.AbstractConsumer;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.rpc.RpcContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * 消费端异步调用
 *
 * @author yitian
 * @date 2020/5/18 16:36
 */
public class AsyncConsumer extends AbstractConsumer{


    public AsyncConsumer(ReferenceConfig referenceConfig) {
        super(referenceConfig);
    }

    @Override
    public boolean hanlder(String s) {
        referenceConfig.setAsync(true);
        System.out.println("同步返回结果:"+getService().sayHello(s));;
        try {
            Future future = RpcContext.getContext().getFuture();
            System.out.println("future 返回结果:"+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return false;
    }
}
