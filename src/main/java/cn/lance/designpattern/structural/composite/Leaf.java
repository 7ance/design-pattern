package cn.lance.designpattern.structural.composite;


import lombok.extern.slf4j.Slf4j;

/**
 * 叶子元素，最底层
 */
@Slf4j
public class Leaf implements Component {

    @Override
    public void execute() {
        log.info("Leaf{}: executing", hashCode());
    }

}
