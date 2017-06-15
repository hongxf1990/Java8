package com.petter.design.Bridge;

/**
 * 桥接模式是一种很实用的结构型设计模式，如果软件系统中某个类存在两个独立变化的维度，通过该模式可以将这两个维度分离出来，使两者可以独立扩展，让系统更加符合“单一职责原则”。
 * 与多层继承方案不同，它将两个独立变化的维度设计为两个独立的继承等级结构，并且在抽象层建立一个抽象关联，该关联关系类似一条连接两个独立继承结构的桥，故名桥接模式。
 *
 * 桥接模式（Bridge Pattern）：将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 它是一种对象结构型模式，又称为柄体（Handle and Body）模式或接口（Interface）模式。
 *
 * @author hongxf
 * @since 2017-06-15 9:24
 */
public abstract class Abstraction {

    protected Implementor impl; //定义实现类接口对象

    public void setImpl(Implementor impl) {
        this.impl = impl;
    }

    public abstract void operation(); //声明抽象业务方法
}
