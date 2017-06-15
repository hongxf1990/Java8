package com.petter.design.Facade;

/**
 * 外观模式(Facade Pattern)：外部与一个子系统的通信必须通过一个统一的外观对象进行，为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，
 * 这个接口使得这一子系统更加容易使用。外观模式又称为门面模式，它是一种对象结构型模式。
 *
 * 外观模式中所指的子系统是一个广义的概念，它可以是一个类、一个功能模块、系统的一个组成部分或者一个完整的系统。
 * 子系统类通常是一些业务类，实现了一些具体的、独立的业务功能
 * @author hongxf
 * @since 2017-06-15 15:30
 */
public class Facade {

    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void Method() {
        subSystemA.MethodA();
        subSystemB.MethodB();
        subSystemC.MethodC();
    }
}
