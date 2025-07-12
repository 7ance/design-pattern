package cn.lance.designpattern.behavioral.chainofresponsibility;


import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理类A
 */
@Slf4j
public class ConcreteHandlerA extends BaseHandler {

    @Override
    public void handle(Request request) {
        log.info("A 对 {} 进行处理", request);

        if (request.getId() % 2 != 0) {
            log.info("id为奇数，不进行后续调用");
            callFlag = false;
        }

        if (callFlag && super.next != null) {
            next.handle(request);
        } else {
            log.info("{} 没有后续，结束", request);
        }
    }

}
