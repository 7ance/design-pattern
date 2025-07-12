package cn.lance.designpattern.creational.factorymethod;

/**
 * 工厂抽象类
 */
public abstract class Creator {

    /**
     * 生产产品的抽象方法，依赖产品接口，不依赖产品实现
     */
    abstract Product createProduct();

    public void someOperation() {
        Product product = createProduct();
        product.doSomething();
    }

}
