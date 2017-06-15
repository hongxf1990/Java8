package com.petter.design.Bridge;

/**
 * @author hongxf
 * @since 2017-06-15 9:27
 */
public class RefinedAbstractionB extends Abstraction {

    @Override
    public void operation() {
        System.out.println("我是第二个扩充抽象类的实现");
        impl.operationImpl(); //调用实现类的方法
    }
}
