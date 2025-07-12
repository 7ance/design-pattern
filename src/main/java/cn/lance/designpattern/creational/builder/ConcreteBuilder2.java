package cn.lance.designpattern.creational.builder;


import java.time.LocalDateTime;

/**
 * 生成器具体实现2
 */
public class ConcreteBuilder2 implements Builder {

    private Product2 product;


    public Product2 getResult() {
        return product;
    }

    @Override
    public void reset() {
        product = new Product2();
    }

    @Override
    public void buildStepA() {
        product.setId(1);
    }

    @Override
    public void buildStepB() {
        product.setCreateDate(LocalDateTime.of(2019, 2, 28, 9, 20));
    }

    @Override
    public void buildStepZ() {
        product.setExpiredDate(LocalDateTime.now());
    }

}
