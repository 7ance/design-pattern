package cn.lance.designpattern.behavioral.command;


import lombok.extern.slf4j.Slf4j;

/**
 * 实际执行类
 */
@Slf4j
public class Receiver {

    void operation(Integer id, String name) {
        log.info("接收者执行复杂命令: id={}, name={}", id, name);
    }

}
