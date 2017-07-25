package com.petter.design.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标类
 * 在目标中定义了一个观察者集合，一个观察目标可以接受任意数量的观察者来观察，它提供一系列方法来增加和删除观察者对象，同时它定义了通知方法notify()
 * @author hongxf
 * @since 2017-07-25 15:37
 */
public abstract class Subject {

    /**
     * 定义一个观察者集合用于存储观察者对象
     */
    protected List<Observer> observers = new ArrayList<>();

    /**
     * 注册方法，用于向观察者集合中添加一个观察者
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 注销方法，用于在观察者集合中删除一个观察者
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public abstract void doSomething();
}
