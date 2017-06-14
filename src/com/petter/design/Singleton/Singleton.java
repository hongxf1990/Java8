package com.petter.design.Singleton;

/**
 * 单例模式(Singleton Pattern)：单例模式确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单例类，它提供全局访问的方法。
 * 单例模式的要点有三个：一是某个类只能有一个实例；二是它必须自行创建这个实例；三是它必须自行向整个系统提供这个实例。
 * 单例模式是一种对象创建型模式。单例模式又名单件模式或单态模式。
 * Created by zer on 2017/6/14.
 */
public class Singleton {
    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {
    }

    public void operator() {
        System.out.println("我是单例的");
    }
}
