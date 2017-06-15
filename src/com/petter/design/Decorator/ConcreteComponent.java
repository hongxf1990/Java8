package com.petter.design.Decorator;

/**
 * @author hongxf
 * @since 2017-06-15 14:22
 */
public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("原始构件方法");
    }
}
