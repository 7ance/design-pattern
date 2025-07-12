package cn.lance.designpattern.structural.composite;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 普通的组合元素，维护一个list，execute方法就是遍历执行子元素
 */
@Slf4j
@Getter
public class Composite implements Component {

    private final List<Component> children = new ArrayList<>();


    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void execute() {
        log.info("Composite{}: start executing", hashCode());
        children.forEach(Component::execute);
        log.info("Composite{}: end executing", hashCode());
    }

}
