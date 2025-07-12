package cn.lance.designpattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

/**
 * 原发器，即需要被保存快照的类<br/>
 * 原发器拥有对备忘录的完全访问权限
 */
@Slf4j
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Originator {

    private String stateA;

    private Integer stateB;

    private Boolean stateC;


    /**
     * 创建快照
     */
    public Snapshot makeSnapshot() {
        log.info("创建快照");
        return new Snapshot(stateA, stateB, stateC);
    }

    /**
     * 从快照恢复
     */
    public void restore(Snapshot snapshot) {
        this.stateA = snapshot.getStateA();
        this.stateB = snapshot.getStateB();
        this.stateC = snapshot.getStateC();
        log.info("从快照恢复");
    }

    /**
     * 快照类，通常是不可变的<br/>
     * 类嵌套在原发器内
     */
    @Getter
    final class Snapshot implements Memento {

        private final String stateA;

        private final Integer stateB;

        private final Boolean stateC;

        private final LocalDateTime snapshotDate;

        /**
         * 通过构造函数一次性传递数据
         */
        public Snapshot(String stateA, Integer stateB, Boolean stateC) {
            this.stateA = stateA;
            this.stateB = stateB;
            this.stateC = stateC;
            this.snapshotDate = LocalDateTime.now();
        }

        @Override
        public String getName() {
            return Originator.class.getName();
        }

        @Override
        public LocalDateTime getSnapshotDate() {
            return snapshotDate;
        }

    }
    
}
