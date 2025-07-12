package cn.lance.designpattern.structural.decorator;

/**
 * 基础装饰类，没有任何额外逻辑，只是定义了结构，方便扩展
 */
public class BaseDecorator implements Component {

    private final Component wrapped;

    public BaseDecorator(Component wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void execute() {
        wrapped.execute();
    }

}
