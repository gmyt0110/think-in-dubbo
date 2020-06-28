package gmyt.dubbo.demo.provider.spi;

import org.apache.dubbo.common.extension.SPI;

/**
 * TODO
 *
 * @author yitian
 * @date 2020/6/26 17:32
 */
@SPI("optimusPrime")
public interface Robot {

    void sayHello();

}

