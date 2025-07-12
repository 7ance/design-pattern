package cn.lance.designpattern.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ComponentB implements Component {

    private Mediator mediator;

    public void operationB() {
        mediator.notify(this);
    }

}
