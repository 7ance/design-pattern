package cn.lance.designpattern.behavioral;

import cn.lance.designpattern.behavioral.chainofresponsibility.*;
import cn.lance.designpattern.behavioral.command.*;
import cn.lance.designpattern.behavioral.iterator.ConcreteCollection;
import cn.lance.designpattern.behavioral.iterator.Iterator;
import cn.lance.designpattern.behavioral.mediator.*;
import cn.lance.designpattern.behavioral.memento.Caretaker;
import cn.lance.designpattern.behavioral.memento.Originator;
import cn.lance.designpattern.behavioral.observer.ConcreteSubscriber;
import cn.lance.designpattern.behavioral.observer.Publisher;
import cn.lance.designpattern.behavioral.state.ConcreteStateA;
import cn.lance.designpattern.behavioral.state.Context;
import cn.lance.designpattern.behavioral.strategy.ConcreteStrategyAdd;
import cn.lance.designpattern.behavioral.strategy.ConcreteStrategyMultiply;
import cn.lance.designpattern.behavioral.strategy.ConcreteStrategySubtract;
import cn.lance.designpattern.behavioral.templatemethod.AbstractClass;
import cn.lance.designpattern.behavioral.templatemethod.ConcreteClassA;
import cn.lance.designpattern.behavioral.templatemethod.ConcreteClassB;
import cn.lance.designpattern.behavioral.visitor.ConcreteVisitor;
import cn.lance.designpattern.behavioral.visitor.ElementA;
import cn.lance.designpattern.behavioral.visitor.ElementB;
import cn.lance.designpattern.behavioral.visitor.Visitor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

@Slf4j
public class BehavioralPatternTest {

    @Test
    public void testChainOfResponsibilityPattern() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Handler h1 = new BaseHandler();
            Handler h2 = new ConcreteHandlerA();
            Handler h3 = new ConcreteHandlerB();
            h1.setNext(h2);
            h2.setNext(h3);

            h1.handle(new Request(System.currentTimeMillis()));

            TimeUnit.MICROSECONDS.sleep(500);
        }
    }

    /**
     * 命令模式将执行所需对象和数据准备好，然后包装成一个完整对象，传递给命令执行对象去执行
     */
    @Test
    public void testCommandPattern() {
        new Invoker(new Command2()).executeCommand();

        Command c1 = new Command1(new Receiver(), 25, "管仲");
        new Invoker(c1).executeCommand();
    }

    @Test
    public void testIteratorPattern() {
        ConcreteCollection collection = new ConcreteCollection();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            log.info(iterator.getNext().toString());
        }
    }

    @Test
    public void testMediatorPattern() {
        // 中介者关联所有组件，所有组件关联中介者，不互相关联
        ConcreteMediator mediator = new ConcreteMediator();
        ComponentA componentA = new ComponentA(mediator);
        ComponentB componentB = new ComponentB(mediator);
        ComponentC componentC = new ComponentC(mediator);
        ComponentD componentD = new ComponentD(mediator);
        mediator.setComponentA(componentA);
        mediator.setComponentB(componentB);
        mediator.setComponentC(componentC);
        mediator.setComponentD(componentD);

        // 每个组件都跟中介者交流
        componentA.operationA();
        componentB.operationB();
        componentC.operationC();
        componentD.operationD();
    }

    @Test
    public void testMementoPattern() {
        Originator originator = new Originator("GTI", 229800, false);

        Caretaker caretaker = new Caretaker();
        caretaker.setOriginator(originator);

        caretaker.doSomething("BRZ", 308800, true);
        log.info("修改后: {}", originator);

        caretaker.doSomething("A45", 489900, false);
        log.info("再修改: {}", originator);

        caretaker.undo();
        log.info("恢复后: {}", originator);

        caretaker.undo();
        log.info("再恢复: {}", originator);
    }

    @Test
    public void testObserverPattern() {
        Publisher publisher = new Publisher();
        for (int i = 0; i < 5; i++) {
            publisher.subscribe(new ConcreteSubscriber(i));
        }
        publisher.mainBusinessLogic("RUNNABLE");
        publisher.unsubscribe(publisher.getSubscribers().get(4));
        publisher.mainBusinessLogic("BLOCKED");
    }

    /**
     * 状态模式适合状态比较多，且经常发生改变的场景<br/>
     * 与策略模式的不同之处在于状态之间知道彼此的存在
     */
    @Test
    public void testStatePattern() {
        ConcreteStateA initialState = new ConcreteStateA();
        Context context = new Context(initialState);
        initialState.setContext(context);

        // 状态A时上下文的操作
        context.doThat();
        context.doThis();
        log.info(context.toString());

        // 状态B时上下文的操作
        context.doThis();
        context.doThat();
        log.info(context.toString());
    }

    /**
     * 策略模式，与状态模式不同之处在于策略之间互不认识
     */
    @Test
    public void testStrategyPattern() {
        cn.lance.designpattern.behavioral.strategy.Context context = new cn.lance.designpattern.behavioral.strategy.Context();

        context.setStrategy(new ConcreteStrategyAdd());
        context.calculate(3, 4);

        context.setStrategy(new ConcreteStrategySubtract());
        context.calculate(5, 2);

        context.setStrategy(new ConcreteStrategyMultiply());
        context.calculate(3, 7);
    }

    /**
     * 模版方法就是顶层抽象类定义好了一个模版方法，模版方法会按照一定顺序调用多个步骤方法，这些步骤方法由子类可由子类重写
     */
    @Test
    public void testTemplateMethodPattern() {
        AbstractClass clazz = new ConcreteClassA();
        clazz.templateMethod();

        clazz = new ConcreteClassB();
        clazz.templateMethod();
    }

    @Test
    public void testVisitorPattern() {
        Visitor visitor = new ConcreteVisitor();

        ElementA elementA = new ElementA();
        // 第一次分派
        elementA.accept(visitor);

        ElementB elementB = new ElementB();
        // 第一次分派
        elementB.accept(visitor);
    }

}
