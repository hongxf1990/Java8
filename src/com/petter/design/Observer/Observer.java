package com.petter.design.Observer;

/**
 * 观察者
 * 将对观察目标的改变做出反应，观察者一般定义为接口，该接口声明了更新数据的方法update()，因此又称为抽象观察者
 * 通常只声明一个update()方法，具体尤器子类实现，不同观察者具有不同的响应方法
 *
 * 定义对象间的一种一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。
 * 观察者模式又叫做发布-订阅（Publish/Subscribe）模式、模型-视图（Model/View）模式、源-监听器（Source/Listener）模式或从属者（Dependents）模式。
 * 观察者模式是一种对象行为型模式。
 * @author hongxf
 * @since 2017-07-25 15:38
 */
public interface Observer {

    void update();
}
