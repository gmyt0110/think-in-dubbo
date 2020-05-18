package gmyt.dubbo.demo.provider.service;

import gmyt.dubbo.demo.api.DemoService;

/**
 * 服务端api
 *
 * @author yitian
 * @date 2020/5/18 14:08
 */
public class DemoServiceImpl implements DemoService {

    /**
     * say hello
     *
     * @param s
     * @return
     */
    @Override
    public String sayHello(String s) {
        return s+" say hello";
    }
}
