package cn.lance.designpattern.creational.prototype;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 具体原型类
 */
@Setter
@ToString
@NoArgsConstructor
public class ConcretePrototype implements Prototype {

    private String field1;


    public ConcretePrototype(ConcretePrototype concretePrototype) {
        this.field1 = concretePrototype.field1;
    }

    @Override
    public Prototype copy() {
        return new ConcretePrototype(this);
    }

}
