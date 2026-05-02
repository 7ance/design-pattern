package cn.lance.designpattern.behavioral.iterator;

/**
 * 具体迭代器
 */
public class ConcreteIterator implements Iterator {

    private final ConcreteCollection concreteCollection;

    private int nextIndex = 0;

    private int left;


    public ConcreteIterator(ConcreteCollection concreteCollection) {
        this.concreteCollection = concreteCollection;
        left = concreteCollection.getElements().isEmpty() ? 0 : concreteCollection.getElements().size();
    }

    @Override
    public Object getNext() {
        if (nextIndex <= concreteCollection.getElements().size() - 1) {
            String element = concreteCollection.getElements().get(nextIndex);
            nextIndex++;
            left--;
            return element;
        }
        return null;
    }

    @Override
    public Boolean hasNext() {
        return left >= 1;
    }

}
