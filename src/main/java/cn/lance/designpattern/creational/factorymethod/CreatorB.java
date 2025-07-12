package cn.lance.designpattern.creational.factorymethod;

/**
 * 工厂实现类B
 */
public class CreatorB extends Creator {

    @Override
    Product createProduct() {
        return new ProductB();
    }

}
