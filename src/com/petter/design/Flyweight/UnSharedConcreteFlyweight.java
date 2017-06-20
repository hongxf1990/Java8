package com.petter.design.Flyweight;

/**
 * 不能被共享的子类可设计为非共享具体享元类；当需要一个非共享具体享元类的对象时可以直接通过实例化创建。
 * @author hongxf
 * @since 2017-06-20 11:01
 */
public class UnSharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(String extrinsicState) {
        System.out.println(intrinsicState);
        System.out.println(extrinsicState);
    }
}
