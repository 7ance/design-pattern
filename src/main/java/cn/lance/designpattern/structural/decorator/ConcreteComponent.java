package cn.lance.designpattern.structural.decorator;


import lombok.extern.slf4j.Slf4j;

/**
 * 普通的具体组件
 */
@Slf4j
public class ConcreteComponent implements Component {

    @Override
    public void execute() {
        log.info("具体部件的执行...");
    }

}
