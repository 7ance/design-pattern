package cn.lance.designpattern.structural.facade;


import lombok.extern.slf4j.Slf4j;

/**
 * 附加外观类
 */
@Slf4j
public class AdditionalFacade {

    public void anotherOperation() {
        log.info("{} 执行中...", getClass().getSimpleName());
    }

}
