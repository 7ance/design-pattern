package cn.lance.designpattern.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 命令调用类
 */
@Data
@AllArgsConstructor
public class Invoker {

    private Command command;

    public void executeCommand() {
        command.execute();
    }

}
