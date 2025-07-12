package cn.lance.designpattern.creational.builder;


import lombok.extern.slf4j.Slf4j;

/**
 * 主管类，在客户端和生成器之间的一层，使得生成对象的过程可以更加灵活
 */
@Slf4j
public class Director {

    private Builder builder;

    public static final String SIMPLE = "simple";


    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void make(String type) {
        log.info("准备生成，使用的生成器: {}", builder.getClass().getSimpleName());
        builder.reset();
        if (SIMPLE.equals(type)) {
            log.info("简单生成一下");
            builder.buildStepA();
        } else {
            log.info("复杂生成一下");
            builder.buildStepB();
            builder.buildStepZ();
        }
    }

}
