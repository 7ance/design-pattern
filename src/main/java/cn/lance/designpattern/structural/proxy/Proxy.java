package cn.lance.designpattern.structural.proxy;


import lombok.extern.slf4j.Slf4j;

/**
 * 代理类，同样实现了服务类接口，可以出现在任何服务类可以出现的地方
 */
@Slf4j
public class Proxy implements Service {

    private final Service realService;

    public Proxy(Service realService) {
        this.realService = realService;
    }

    @Override
    public void operation() {
        log.info("代理类的前置逻辑执行...");
        realService.operation();
        log.info("代理类的后置逻辑执行...");
    }

}
