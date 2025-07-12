package cn.lance.designpattern.creational.factorymethod;


import lombok.extern.slf4j.Slf4j;

/**
 * 产品实现B
 */
@Slf4j
public class ProductB implements Product {

    @Override
    public void doSomething() {
        log.info("{}正在做B工作", getClass().getSimpleName());
    }

}
