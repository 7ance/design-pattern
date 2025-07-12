package cn.lance.designpattern.behavioral.templatemethod;


import lombok.extern.slf4j.Slf4j;

/**
 * 抽象类，声明模版方法，以及可以给子类重写的步骤方法
 */
@Slf4j
public abstract class AbstractClass {

    public void templateMethod() {
        step1();
        step2();
        step3();
    }

    void step1() {
        log.info("默认实现步骤一");
    }

    abstract void step2();

    abstract void step3();

}
