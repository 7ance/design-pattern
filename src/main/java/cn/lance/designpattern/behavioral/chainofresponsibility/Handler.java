package cn.lance.designpattern.behavioral.chainofresponsibility;

/**
 * 处理类顶层接口
 */
public interface Handler {

    void setNext(Handler next);

    void handle(Request request);

    boolean callNext();

}
