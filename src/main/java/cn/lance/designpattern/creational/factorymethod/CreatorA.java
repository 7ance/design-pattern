package cn.lance.designpattern.creational.factorymethod;

/**
 * 工厂实现类A
 */
public class CreatorA extends Creator {

    @Override
    Product createProduct() {
        return new ProductA();
    }

}
