package com.petter.design.Factory.abstractFactory;


/**
 * 抽象工厂模式(Abstract Factory Pattern)：提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。抽象工厂模式又称为Kit模式，属于对象创建型模式。
 * @author hongxf
 * @since 2017-06-14 9:33
 */
public interface Factory {

    ProductA createProductA();
    ProductB createProductB();
}
