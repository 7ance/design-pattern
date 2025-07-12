package cn.lance.designpattern.creational.singleton;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;

/**
 * 单例类，持有自己的实例（不一定非要自己持有），一般就是工具类或者什么需要控制一致性的场景，Spring中的Bean默认就是单例的
 */
@Slf4j
@ToString
public class Singleton {

    private final Integer id;


    private Singleton() {
        log.info("Singleton构造方法被调用");
        id = RandomUtils.insecure().randomInt();
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
