package com.petter.design.Adapter;

/**
 * 适配器模式(Adapter Pattern) ：将一个接口转换成客户希望的另一个接口，适配器模式使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。
 * 适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
 *
 * 此为对象适配器模式
 * @author hongxf
 * @since 2017-06-14 14:22
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    /**
     * 默认适配者
     */
    public Adapter() {
        this.adaptee = new Adaptee();
    }

    /**
     * 自定义适配者，客户端传入，可以把适配者类和它的子类都适配到目标接口。
     * @param adaptee
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
