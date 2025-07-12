package cn.lance.designpattern.creational.abstractfactory;

/**
 * 具体工厂返回具体的产品
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }

}
