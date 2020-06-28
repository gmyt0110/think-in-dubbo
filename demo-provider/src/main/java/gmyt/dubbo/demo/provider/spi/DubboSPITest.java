package gmyt.dubbo.demo.provider.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.common.extension.SPI;
import org.junit.Test;

/**
 * TODO
 *
 * @author yitian
 * @date 2020/6/26 17:35
 */
public class DubboSPITest {

    @Test
    public void sayHello() throws Exception {
        Class tClass = Robot.class;
        System.out.println(tClass.getName());

        ExtensionLoader<Robot> extensionLoader =
            ExtensionLoader.getExtensionLoader(Robot.class);

//        Class tClass = Robot.class;
//        tClass.isAnnotationPresent(SPI.class);

        Robot optimusPrime1 = extensionLoader.getExtension("true");

        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }

}
