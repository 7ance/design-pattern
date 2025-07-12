package cn.lance.designpattern.creational.builder;


/**
 * 生成器具体实现1
 */
public class ConcreteBuilder1 implements Builder {

    private Product1 product;

    /**
     * 自有的获取生成对象的方法，因为不一定所有产品都能统一成某个接口，所以不定义在生成器接口中
     */
    public Product1 getResult() {
        return product;
    }

    @Override
    public void reset() {
        product = new Product1();
    }

    @Override
    public void buildStepA() {
        product.setFeatureA("Russia");
    }

    @Override
    public void buildStepB() {
        product.setFeatureB(200);
    }

    @Override
    public void buildStepZ() {
        product.setFeatureZ(true);
    }

}
