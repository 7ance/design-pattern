package cn.lance.designpattern.creational.abstractfactory;

/**
 * 抽象工厂接口，依赖的都是抽象产品
 */
public interface AbstractFactory {

    ProductA createProductA();

    ProductB createProductB();

}
