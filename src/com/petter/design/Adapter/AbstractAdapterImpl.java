package com.petter.design.Adapter;

/**
 * 默认适配器模式，用于不需要全部实现接口提供的方法
 * @author hongxf
 * @since 2017-06-14 15:22
 */
public class AbstractAdapterImpl extends AbstractAdapter implements Target2 {

    private Adaptee adaptee;

    public AbstractAdapterImpl() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
