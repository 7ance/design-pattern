package cn.lance.designpattern.behavioral.observer;

/**
 * 订阅者顶级接口
 */
public interface Subscriber {

    void update(String context);

}
