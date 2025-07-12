package cn.lance.designpattern.behavioral.mediator;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体中介者，组件A、B、C、D都依赖中介者进行交流，避免互相依赖，减少复杂度
 */
@Slf4j
@Setter
@Getter
public class ConcreteMediator implements Mediator {

    private ComponentA componentA;

    private ComponentB componentB;

    private ComponentC componentC;

    private ComponentD componentD;

    /**
     * 在这个例子中，组件A和B交流，组件C和D交流
     */
    @Override
    public void notify(Component component) {
        if (component == componentA) {
            reactOnA();
        } else if (component == componentB) {
            reactOnB();
        } else if (component == componentC) {
            reactOnC();
        } else if (component == componentD) {
            reactOnD();
        }
    }

    private void reactOnA() {
        log.info("中介者响应组件A");
    }

    private void reactOnB() {
        log.info("中介者响应组件B");
    }

    private void reactOnC() {
        log.info("中介者响应组件C");
    }

    private void reactOnD() {
        log.info("中介者响应组件D");
    }

}
