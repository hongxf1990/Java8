package com.petter.design.Adapter;

/**
 * 当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），
 * 那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求，它适用于一个接口不想使用其所有的方法的情况。因此也称为单接口适配器模式。
 *
 * @author hongxf
 * @since 2017-06-14 15:21
 */
public abstract class AbstractAdapter implements Target2 {

    @Override
    public void request() {

    }

    @Override
    public void request2() {

    }
}
