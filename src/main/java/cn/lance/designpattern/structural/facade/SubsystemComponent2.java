package cn.lance.designpattern.structural.facade;


import lombok.extern.slf4j.Slf4j;

/**
 * 子系统类2
 */
@Slf4j
public class SubsystemComponent2 {

    public void execute() {
        log.info(getClass().getSimpleName() + " 执行中...");
    }
}
