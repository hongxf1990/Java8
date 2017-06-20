package com.petter.design.Flyweight;

import java.util.HashMap;

/**
 * 享元工厂类的作用在于提供一个用于存储享元对象的享元池，
 * 当用户需要对象时，首先从享元池中获取，如果享元池中不存在，则创建一个新的享元对象返回给用户，并在享元池中保存该新增对象。
 * @author hongxf
 * @since 2017-06-20 9:33
 */
public class FlyweightFactory {

    private static FlyweightFactory instance;

    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        if (instance == null) {
            instance = new FlyweightFactory();
        }
        return instance;
    }

    public Flyweight getFlyweight(String key) {
        return flyweights.computeIfAbsent(key, k -> new ConcreteFlyweight());
    }
}
