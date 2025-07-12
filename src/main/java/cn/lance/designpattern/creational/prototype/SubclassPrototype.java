package cn.lance.designpattern.creational.prototype;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 具体原型类的子类，扩展了属性
 */
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class SubclassPrototype extends ConcretePrototype {

    private String field2;


    public SubclassPrototype(SubclassPrototype subclassPrototype) {
        super(subclassPrototype);
        this.field2 = subclassPrototype.field2;
    }

    @Override
    public Prototype copy() {
        return new SubclassPrototype(this);
    }

}
