package com.petter.design.Bridge;

/**
 * @author hongxf
 * @since 2017-06-15 9:27
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        impl.operationImpl(); //调用实现类的方法
    }
}
