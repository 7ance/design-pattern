package cn.lance.designpattern.creational;

import cn.lance.designpattern.creational.abstractfactory.Client;
import cn.lance.designpattern.creational.abstractfactory.ConcreteFactory1;
import cn.lance.designpattern.creational.abstractfactory.ConcreteFactory2;
import cn.lance.designpattern.creational.builder.*;
import cn.lance.designpattern.creational.factorymethod.Creator;
import cn.lance.designpattern.creational.factorymethod.CreatorA;
import cn.lance.designpattern.creational.factorymethod.CreatorB;
import cn.lance.designpattern.creational.prototype.ConcretePrototype;
import cn.lance.designpattern.creational.prototype.Prototype;
import cn.lance.designpattern.creational.prototype.SubclassPrototype;
import cn.lance.designpattern.creational.singleton.Singleton;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class CreationalPatternTest {

    @Test
    public void testAbstractFactoryPattern() {
        Client client = new Client(new ConcreteFactory1());
        client.someOperation();


        client = new Client(new ConcreteFactory2());
        client.someOperation();
    }

    @Test
    public void testBuilderPattern() {
        // 生成的产品还是需要从具体生成器中获取，因为不一定所有生成器返回的产品类型相同，所以没法写在Builder接口中
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        Director director = new Director(concreteBuilder1);
        director.make("simple");
        Product1 product1 = concreteBuilder1.getResult();
        log.info("产品1详情: {}", product1);

        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();
        director.changeBuilder(concreteBuilder2);
        director.make("complex");
        Product2 product2 = concreteBuilder2.getResult();
        log.info("产品2详情: {}", product2);
    }

    @Test
    public void testFactoryMethodPattern() {
        // 根据不同条件选择初始化对应的Creator
        Creator creator = new CreatorA();
        creator.someOperation();

        creator = new CreatorB();
        creator.someOperation();
    }

    @Test
    public void testPrototypePattern() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setField1("xxx");
        Prototype prototypeCopy = prototype.copy();
        log.info("prototype: {}", prototype);
        log.info("prototypeCopy: {}", prototypeCopy);
        boolean classEquals = prototype == prototypeCopy;
        log.info("prototype == prototypeCopy ? {}", classEquals);

        SubclassPrototype subclassPrototype = new SubclassPrototype();
        subclassPrototype.setField1("awesome");
        subclassPrototype.setField2("beautiful");
        Prototype subclassPrototypeCopy = subclassPrototype.copy();
        log.info("subclassPrototype: {}", subclassPrototype);
        log.info("subclassPrototypeCopy: {}", subclassPrototypeCopy);
        boolean subclassEquals = subclassPrototype == subclassPrototypeCopy;
        log.info("subclassPrototype == subclassPrototypeCopy ? {}", subclassEquals);
    }

    @Test
    public void testSingletonPattern() {
        Set<Singleton> instances = new HashSet<>();

        // 除了第一次获取实例时创建对象，后面都是获取的同一个对象，单例
        for (int i = 0; i < 1000; i++) {
            Singleton instance = Singleton.getInstance();
            instances.add(instance);
        }

        log.info(instances.toString());
    }

}
