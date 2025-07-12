package cn.lance.designpattern.structural.bridge;


import lombok.extern.slf4j.Slf4j;

/**
 * 具体实现，可以通过替换实现类从而控制实现的逻辑<br/>
 * 在这个例子中只有一个具体实现
 */
@Slf4j
public class ConcreteImplementation implements Implementation {

    @Override
    public void method1() {
        log.info("method1");
    }

    @Override
    public void method2() {
        log.info("method2");
    }

    @Override
    public void method3() {
        log.info("method3");
    }

}
