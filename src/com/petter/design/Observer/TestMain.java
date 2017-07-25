package com.petter.design.Observer;

/**
 * @author hongxf
 * @since 2017-07-25 16:10
 */
public class TestMain {

    public static void main(String[] args) {
        Subject sub = new ConcreteSubject();
        sub.attach(new ConcreteObserverA());
        sub.attach(new ConcreteObserverB());
        sub.doSomething();
    }
}
