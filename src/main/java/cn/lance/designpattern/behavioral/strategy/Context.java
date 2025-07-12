package cn.lance.designpattern.behavioral.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Context {

    private Strategy strategy;

    public void calculate(Integer a, Integer b) {
        strategy.execute(a, b);
    }

}
