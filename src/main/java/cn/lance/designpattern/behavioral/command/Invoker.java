package cn.lance.designpattern.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 命令调用类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoker {

    private Command command;

    public void executeCommand() {
        command.execute();
    }

}
