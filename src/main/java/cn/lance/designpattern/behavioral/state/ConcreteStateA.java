package cn.lance.designpattern.behavioral.state;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体状态类A
 */
@Slf4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ConcreteStateA implements State {

    private Context context;

    @Override
    public void doThis() {
        log.info("状态A将上下文状态修改为B");
        context.changeState(new ConcreteStateB(context));
    }

    @Override
    public void doThat() {
        log.info("状态A什么也不做");
    }

    @Override
    public String toString() {
        return "状态A";
    }

}
