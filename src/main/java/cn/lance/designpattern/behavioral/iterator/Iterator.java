package cn.lance.designpattern.behavioral.iterator;

/**
 * 迭代器顶级接口
 */
public interface Iterator {

    Object getNext();

    Boolean hasNext();

}
