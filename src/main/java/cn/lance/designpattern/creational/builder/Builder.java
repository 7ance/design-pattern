package cn.lance.designpattern.creational.builder;

/**
 * 生成器接口，定义了所有的步骤方法，具体使用时可以选择性调用
 */
public interface Builder {

    /**
     * 用来重置生成器持有的对象
     */
    void reset();

    void buildStepA();

    void buildStepB();

    void buildStepZ();

}
