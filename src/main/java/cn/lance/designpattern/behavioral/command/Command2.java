package cn.lance.designpattern.behavioral.command;


import lombok.extern.slf4j.Slf4j;

/**
 * 命令实现类2
 */
@Slf4j
public class Command2 implements Command {

    @Override
    public void execute() {
        log.info("命令对象自己进行简单执行");
    }

}
