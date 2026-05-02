package cn.lance.designpattern.behavioral.chainofresponsibility;

import lombok.Setter;

/**
 * 处理类简单实现，定义了基本结构，复杂实现可以通过扩展这个类获得
 */
public class BaseHandler implements Handler {

    protected Handler next;

    @Setter
    private boolean callFlag = true;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request request) {
        if (callNext() && next != null) {
            next.handle(request);
        }
    }

    @Override
    public boolean callNext() {
        return callFlag;
    }

}
