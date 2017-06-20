package com.petter.design.Proxy;

/**
 * @author hongxf
 * @since 2017-06-20 11:21
 */
public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("调用真正主题角色");
    }
}
