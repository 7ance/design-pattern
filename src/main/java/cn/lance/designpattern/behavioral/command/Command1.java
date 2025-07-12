package cn.lance.designpattern.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 命令实现类1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Command1 implements Command {

    private Receiver receiver;

    private Integer id;

    private String name;

    @Override
    public void execute() {
        receiver.operation(id, name);
    }

}
