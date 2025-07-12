package cn.lance.designpattern.structural.adapter;

/**
 * 被适配的类
 */
public final class Service {

    /**
     * 被适配的方法，一般是第三方的接口，不便于改动
     */
    Integer calculate(Integer a, Integer b) {
        return a + b;
    }

}
