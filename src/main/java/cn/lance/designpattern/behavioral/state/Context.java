package cn.lance.designpattern.behavioral.state;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 上下文类
 */
@Getter
@Setter
@AllArgsConstructor
public class Context {

    private State state;

    public void changeState(State state) {
        this.state = state;
    }

    public void doThis() {
        state.doThis();
    }

    public void doThat() {
        state.doThat();
    }

    @Override
    public String toString() {
        return "上下文的状态: " + state;
    }

}
