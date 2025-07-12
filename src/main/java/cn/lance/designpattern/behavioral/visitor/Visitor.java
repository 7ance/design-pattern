package cn.lance.designpattern.behavioral.visitor;

/**
 * 访问者顶级接口
 * <p>
 * 负责执行操作
 */
public interface Visitor {

    void visit(ElementA elementA);

    void visit(ElementB elementB);

}
