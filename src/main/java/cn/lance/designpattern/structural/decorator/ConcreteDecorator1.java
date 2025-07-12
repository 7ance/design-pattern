package cn.lance.designpattern.structural.decorator;


import lombok.extern.slf4j.Slf4j;

/**
 * 具体装饰类1，有执行额外逻辑
 */
@Slf4j
public class ConcreteDecorator1 extends BaseDecorator {

    public ConcreteDecorator1(Component wrapped) {
        super(wrapped);
    }

    @Override
    public void execute() {
        super.execute();
        extra();
    }

    private void extra() {
        log.info("执行额外操作1...");
    }

}
