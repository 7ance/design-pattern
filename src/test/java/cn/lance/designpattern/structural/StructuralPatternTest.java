package cn.lance.designpattern.structural;

import cn.lance.designpattern.structural.adapter.Adapter;
import cn.lance.designpattern.structural.adapter.ClientInterface;
import cn.lance.designpattern.structural.bridge.Abstraction;
import cn.lance.designpattern.structural.bridge.ConcreteImplementation;
import cn.lance.designpattern.structural.bridge.RefinedAbstraction;
import cn.lance.designpattern.structural.composite.Component;
import cn.lance.designpattern.structural.composite.Composite;
import cn.lance.designpattern.structural.composite.Leaf;
import cn.lance.designpattern.structural.decorator.ConcreteComponent;
import cn.lance.designpattern.structural.decorator.ConcreteDecorator1;
import cn.lance.designpattern.structural.decorator.ConcreteDecorator2;
import cn.lance.designpattern.structural.facade.Facade;
import cn.lance.designpattern.structural.flyweight.Context;
import cn.lance.designpattern.structural.flyweight.FlyweightFactory;
import cn.lance.designpattern.structural.proxy.Proxy;
import cn.lance.designpattern.structural.proxy.Service;
import cn.lance.designpattern.structural.proxy.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class StructuralPatternTest {

    @Test
    public void testAdapterPattern() {
        ClientInterface client = new Adapter();
        String result = client.calculate("10", "20");
        log.info("result: {}", result);
    }

    /**
     * 这里只演示了抽象部分的替换，实现部分都是一样的
     */
    @Test
    public void testBridgePattern() {
        Abstraction abstraction = new Abstraction();
        abstraction.setImplementation(new ConcreteImplementation());
        abstraction.feature1();
        abstraction.feature2();

        RefinedAbstraction refinedAbstraction = new RefinedAbstraction();
        refinedAbstraction.setImplementation(new ConcreteImplementation());
        refinedAbstraction.feature3();
    }

    @Test
    public void testCompositePattern() {
        Component component = createComponent();
        component.execute();
    }

    private Component createComponent() {
        Composite composite = new Composite();
        for (int i = 0; i < 5; i++) {
            Composite childComposite = new Composite();
            childComposite.add(new Leaf());
            composite.add(childComposite);

            composite.add(new Leaf());
        }
        return composite;
    }

    /**
     * 装饰模式就像是俄罗斯套娃
     */
    @Test
    public void testDecoratorPattern() {
        cn.lance.designpattern.structural.decorator.Component a = new ConcreteComponent();
        a.execute();

        cn.lance.designpattern.structural.decorator.Component b = new ConcreteDecorator1(a);
        b.execute();

        cn.lance.designpattern.structural.decorator.Component c = new ConcreteDecorator2(b);
        c.execute();
    }

    @Test
    public void testFacadePattern() {
        // Client直接通过外观类与复杂系统交互，简单直接
        Facade facade = new Facade();
        facade.subsystemOperation(true);
    }

    @Test
    public void testFlyweightPattern() {
        FlyweightFactory factory = new FlyweightFactory();

        Context shenzhen = new Context("shenzhen", factory.getFlyweight("8"));
        shenzhen.operation();

        Context guangzhou = new Context("guangzhou", factory.getFlyweight("8"));
        guangzhou.operation();

        Context beijing = new Context("beijing", factory.getFlyweight("2"));
        beijing.operation();
    }

    @Test
    public void testProxyPattern() {
        // 普通实现类
        Service origin = new ServiceImpl();
        origin.operation();

        // 代理类
        Service proxy = new Proxy(origin);
        proxy.operation();
    }

}
