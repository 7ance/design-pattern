package cn.lance.designpattern.behavioral.visitor;


import lombok.extern.slf4j.Slf4j;

/**
 * 具体访问者
 */
@Slf4j
public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ElementA elementA) {
        log.info("visitor获取到要访问的对象: {}", elementA.getClass().getSimpleName());
    }

    @Override
    public void visit(ElementB elementB) {
        log.info("visitor获取到要访问的对象: {}", elementB.getClass().getSimpleName());
    }

}
