package cn.lance.designpattern.behavioral.visitor;

/**
 * 元素顶级接口，声明了一个方法来接收访问者，这里用到了"双分派"的方式
 * <p>
 * 负责封装结构
 */
public interface Element {

    void accept(Visitor visitor);

}
