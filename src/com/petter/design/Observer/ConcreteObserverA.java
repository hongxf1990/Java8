package com.petter.design.Observer;

/**
 * 具体观察者A
 *
 * @author hongxf
 * @since 2017-07-25 15:49
 */
public class ConcreteObserverA implements Observer {

    @Override
    public void update() {
        System.out.println("具体观察者A的操作");
    }
}
