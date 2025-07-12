package cn.lance.designpattern.behavioral.memento;

import java.time.LocalDateTime;

/**
 * 备忘录接口
 */
public interface Memento {

    String getName();

    LocalDateTime getSnapshotDate();

}
