package cn.lance.designpattern.behavioral.iterator;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体集合类
 */
@Getter
@Setter
public class ConcreteCollection implements IterableCollection {

    private List<String> elements = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public boolean add(String str) {
        return elements.add(str);
    }

}
