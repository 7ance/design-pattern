package cn.lance.designpattern.structural.facade;

/**
 * 外观类，屏蔽了内部的复杂性
 */
public class Facade {

    /**
     * 可选的附加外观类，避免单一外观类功能无限膨胀，Client也可以直接使用附加外观类
     */
    private final AdditionalFacade optionalAdditionalFacade = new AdditionalFacade();


    /**
     * 复杂的子系统操作，外观类将其屏蔽了，除了外观类，Client一无所知
     */
    public void subsystemOperation(Boolean additional) {
        SubsystemComponent1 subsystemComponent1 = new SubsystemComponent1();
        subsystemComponent1.execute();

        SubsystemComponent2 subsystemComponent2 = new SubsystemComponent2();
        subsystemComponent2.execute();

        if (additional) {
            optionalAdditionalFacade.anotherOperation();
        }
    }

}
