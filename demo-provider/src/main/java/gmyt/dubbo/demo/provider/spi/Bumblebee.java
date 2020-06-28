package gmyt.dubbo.demo.provider.spi;

/**
 * TODO
 *
 * @author yitian
 * @date 2020/6/26 17:33
 */
public class Bumblebee implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }

}
