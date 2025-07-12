package cn.lance.designpattern.creational.abstractfactory;


import lombok.extern.slf4j.Slf4j;

/**
 * Client依赖的都是抽象的（AbstractFactory、ProductA、ProductB）
 */
@Slf4j
public class Client {

    private final AbstractFactory factory;


    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void someOperation() {
        // Client不关心具体产品A、B是什么，只要它们是自己想要的产品就行
        ProductA productA = factory.createProductA();
        log.info("A类产品的等级是: {}", productA.getLevel());

        ProductB productB = factory.createProductB();
        log.info("B类产品的等级是: {}", productB.getLevel());

    }

}
