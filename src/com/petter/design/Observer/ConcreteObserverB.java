package com.petter.design.Observer;

/**
 * 具体观察者B
 *
 * @author hongxf
 * @since 2017-07-25 15:49
 */
public class ConcreteObserverB implements Observer {

    @Override
    public void update() {
        System.out.println("具体观察者B的操作");
    }
}
