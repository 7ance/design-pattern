package cn.lance.designpattern.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ComponentC implements Component {

    private Mediator mediator;

    public void operationC() {
        mediator.notify(this);
    }

}
