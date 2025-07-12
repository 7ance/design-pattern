package cn.lance.designpattern.structural.flyweight;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 享元类，维护了一些变化属性
 */
@Slf4j
@AllArgsConstructor
public class Flyweight {

    private final String repeatingState;

    public void operation(String uniqueState) {
        log.info("{} hashCode: {}", getClass().getSimpleName(), hashCode());
        log.info("operating... uniqueState: {}, repeatingState: {}", uniqueState, repeatingState);
    }

}
