package cn.lance.designpattern.behavioral.templatemethod;


import lombok.extern.slf4j.Slf4j;

/**
 * 具体类A
 */
@Slf4j
public class ConcreteClassA extends AbstractClass {

    @Override
    void step1() {
        log.info("具体类A步骤一");
    }

    @Override
    void step2() {
        log.info("具体类A步骤二");
    }

    @Override
    void step3() {
        log.info("具体类A步骤三");
    }
    
}
