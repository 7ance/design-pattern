package cn.lance.designpattern.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteStrategyAdd implements Strategy {

    @Override
    public void execute(Integer a, Integer b) {
        int result = a + b;
        log.info("add result: {}", result);
    }

}
