package cn.lance.designpattern.creational.prototype;

/**
 * 原型接口，实现了这个接口，就可以通过copy()方法快速地从一个已有的对象复制出一个新对象
 */
public interface Prototype {

    Prototype copy();

}
