package cn.lance.designpattern.structural.bridge;

import lombok.Getter;
import lombok.Setter;

/**
 * 桥接模式就是将一个类层次转化为多个相关的类层次，避免单个类层次的失控<br/>
 * 比如 颜色+形状 ，两两组合就四种了，如果为每个具体类型都创建一个类，会很多<br/>
 * 桥接模式可以将一个大类或一系列紧密结合的类拆分成抽象和实现两个独立的层次结构<br/><br/>
 * 抽象部分
 */
@Getter
@Setter
public class Abstraction {

    /**
     * 实现部分
     */
    private Implementation implementation;

    /**
     * 抽象部分在这里没有设计成"接口-实现"的形式，直接定义类方法作为抽象部分的逻辑，如果要扩展抽象部分，通过子类扩展
     */
    public void feature1() {
        implementation.method1();
    }

    public void feature2() {
        implementation.method2();
        implementation.method3();
    }

}
