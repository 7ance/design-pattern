package cn.lance.designpattern.behavioral.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 发布者
 */
@Getter
public class Publisher {

    private final List<Subscriber> subscribers = new ArrayList<>();

    private String mainState = "NEW";

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String context) {
        subscribers.forEach(e -> e.update(context));
    }

    public void mainBusinessLogic(String state) {
        String originState = mainState;
        mainState = state;
        String context = originState + " -> " + state;
        notifySubscribers(context);
    }

}
