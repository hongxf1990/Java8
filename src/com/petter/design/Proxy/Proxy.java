package com.petter.design.Proxy;

/**
 * 给某一个对象提供一个代理，并由代理对象控制对原对象的引用。代理模式的英 文叫做Proxy或Surrogate，它是一种对象结构型模式。
 * 通过代理对象去掉客户不能看到的内容和服务或者添加客户需要的额外服务。
 *
 * 代理模式与适配器模式的区别在于代理模式暴露给客户端的接口还是原来的接口，只是中间进行了处理，而适配器则完全换了一个客户端需要的接口形式
 * @author hongxf
 * @since 2017-06-20 11:19
 */
public class Proxy implements Subject {

    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("调用真正角色前处理");
    }

    private void postRequest() {
        System.out.println("调用真正角色后处理");
    }
}
