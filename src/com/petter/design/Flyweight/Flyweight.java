package com.petter.design.Flyweight;

/**
 * 享元模式(Flyweight Pattern)：运用共享技术有效地支持大量细粒度对象的复用。
 * 系统只使用少量的对象，而这些对象都很相似，状态变化很小，可以实现对象的多次复用。
 * 由于享元模式要求能够共享的对象必须是细粒度对象，因此它又称为轻量级模式，它是一种对象结构型模式。
 *
 * 通常是一个接口或抽象类，在抽象享元类中声明了具体享元类公共的方法，这些方法可以向外界提供享元对象的内部数据（内部状态），同时也可以通过这些方法来设置外部数据（外部状态）
 * @author hongxf
 * @since 2017-06-20 9:28
 */
public abstract class Flyweight {

    //内部状态intrinsicState作为成员变量，同一个享元对象其内部状态是一致的
    protected String intrinsicState;

    public Flyweight() {
    }

    public Flyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void setIntrinsicState(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    //外部状态extrinsicState在使用时由外部设置，不保存在享元对象中，即使是同一个对象，在每一次调用时也可以传入不同的外部状态
    public abstract void operation(String extrinsicState);
}
