package cn.lance.designpattern.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

import java.util.Stack;

/**
 * 负责人，只能访问备忘录的元数据，不能修改<br/>
 * 负责人只知道何时和为何保存原发器的状态，以及何时恢复状态<br/>
 * 可以结合命令模式，让命令对象作为负责人
 */
@Getter
@Setter
public class Caretaker {

    private Originator originator;

    /**
     * 维护备忘录栈
     */
    private Stack<Originator.Snapshot> history = new Stack<>();


    public void doSomething(String stateA, Integer stateB, Boolean stateC) {
        // 保存快照
        Originator.Snapshot snapshot = originator.makeSnapshot();
        history.push(snapshot);

        // 修改状态
        originator.setStateA(stateA);
        originator.setStateB(stateB);
        originator.setStateC(stateC);
    }

    public void undo() {
        Originator.Snapshot snapshot = history.pop();
        originator.restore(snapshot);
    }

}
