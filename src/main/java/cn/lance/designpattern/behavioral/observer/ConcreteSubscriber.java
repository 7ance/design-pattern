package cn.lance.designpattern.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体订阅者
 */
@Slf4j
@AllArgsConstructor
public class ConcreteSubscriber implements Subscriber {

    private Integer id;

    @Override
    public void update(String context) {
        log.info("订阅者{} 收到消息: {}", id, context);
    }

}
