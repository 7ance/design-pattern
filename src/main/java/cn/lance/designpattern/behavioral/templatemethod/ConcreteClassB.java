package cn.lance.designpattern.behavioral.templatemethod;


import lombok.extern.slf4j.Slf4j;

/**
 * 具体类B
 */
@Slf4j
public class ConcreteClassB extends AbstractClass {

    @Override
    void step2() {
        log.info("具体类B步骤二");
    }

    @Override
    void step3() {
        log.info("具体类B步骤三");
    }
}
