package cn.lance.designpattern.behavioral.state;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体状态类B
 */
@Slf4j
@Getter
@Setter
@AllArgsConstructor
public class ConcreteStateB implements State {

    private Context context;

    @Override
    public void doThis() {
        log.info("状态B什么也不做");
    }

    @Override
    public void doThat() {
        log.info("状态B将上下文状态修改为A");
        context.changeState(new ConcreteStateA(context));
    }

    @Override
    public String toString() {
        return "状态B";
    }

}
