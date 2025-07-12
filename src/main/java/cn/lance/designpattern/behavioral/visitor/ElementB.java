package cn.lance.designpattern.behavioral.visitor;

/**
 * 具体元素类B
 */
public class ElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        // 第二次分派
        visitor.visit(this);
    }

}
