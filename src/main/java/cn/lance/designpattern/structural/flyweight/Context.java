package cn.lance.designpattern.structural.flyweight;

import lombok.AllArgsConstructor;

/**
 * 数量巨大的对象类，为了降低内存占用，内部维护了可复用的享元对象
 */
@AllArgsConstructor
public class Context {

    /**
     * 外在状态，对象自己维护
     */
    private final String uniqueState;

    /**
     * 内在状态，通过享元对象共享，减少内存占用，提高复用率
     */
    private final Flyweight flyweight;

    public void operation() {
        flyweight.operation(uniqueState);
    }

}
