package com.petter.design.Observer;

/**
 * 具体目标类是目标类的子类
 * 通常它包含有经常发生改变的数据，当它的状态发生改变时，向它的各个观察者发出通知；
 * 同时它还实现了在目标类中定义的抽象业务逻辑方法（如果有的话）。如果无须扩展目标类，则具体目标类可以省略。
 * @author hongxf
 * @since 2017-07-25 15:43
 */
public class ConcreteSubject extends Subject {

    @Override
    public void doSomething() {
        System.out.println("目标类发生事情，通知所有观察者");
        this.notifyObserver();
    }
}
