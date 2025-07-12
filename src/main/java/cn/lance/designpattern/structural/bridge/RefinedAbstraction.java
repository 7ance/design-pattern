package cn.lance.designpattern.structural.bridge;

/**
 * 抽象部分的扩展
 */
public class RefinedAbstraction extends Abstraction {

    /**
     * 新的抽象部分的逻辑
     */
    public void feature3() {
        getImplementation().method3();
        getImplementation().method2();
        getImplementation().method1();
    }

}
