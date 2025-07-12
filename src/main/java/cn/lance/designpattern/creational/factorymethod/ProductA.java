package cn.lance.designpattern.creational.factorymethod;


import lombok.extern.slf4j.Slf4j;

/**
 * 产品实现A
 */
@Slf4j
public class ProductA implements Product {

    @Override
    public void doSomething() {
        log.info("{}正在做A工作", getClass().getSimpleName());
    }

}
