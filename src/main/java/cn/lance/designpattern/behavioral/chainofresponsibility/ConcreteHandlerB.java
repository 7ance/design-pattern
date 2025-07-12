package cn.lance.designpattern.behavioral.chainofresponsibility;


import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理类B
 */
@Slf4j
public class ConcreteHandlerB extends BaseHandler {

    @Override
    public void handle(Request request) {
        log.info("B 对 {} 进行处理", request);

        if (callFlag && super.next != null) {
            next.handle(request);
        } else {
            log.info("{} 没有后续，结束", request);
        }
    }

}
