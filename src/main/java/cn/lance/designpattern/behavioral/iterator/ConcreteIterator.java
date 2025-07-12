package cn.lance.designpattern.behavioral.iterator;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 具体迭代器
 */
public class ConcreteIterator implements Iterator {

    private final ConcreteCollection concreteCollection;

    private final Lock LOCK = new ReentrantLock();

    private int nextIndex = 0;

    private int left;


    public ConcreteIterator(ConcreteCollection concreteCollection) {
        this.concreteCollection = concreteCollection;
        left = concreteCollection.getElements().isEmpty() ? 0 : concreteCollection.getElements().size();
    }

    @Override
    public Object getNext() {
        if (nextIndex <= concreteCollection.getElements().size() - 1) {
            LOCK.lock();
            String element = concreteCollection.getElements().get(nextIndex);
            nextIndex++;
            left--;
            LOCK.unlock();
            return element;
        }
        return null;
    }

    @Override
    public Boolean hasNext() {
        return left >= 1;
    }

}
