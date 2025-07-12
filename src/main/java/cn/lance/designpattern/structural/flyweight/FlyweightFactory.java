package cn.lance.designpattern.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂，进一步复用享元对象，降低内存占用
 */
public class FlyweightFactory {

    private static final Map<String, Flyweight> CACHE = new ConcurrentHashMap<>();

    public Flyweight getFlyweight(String repeatingState) {
        Flyweight flyweight;
        if (!CACHE.containsKey(repeatingState)) {
            flyweight = new Flyweight(repeatingState);
            CACHE.put(repeatingState, flyweight);
        }
        return CACHE.get(repeatingState);
    }

}
