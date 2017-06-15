package com.petter.design.Bridge;

/**
 * @author hongxf
 * @since 2017-06-15 9:29
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("实现类接口Implementor的实现A");
    }
}
