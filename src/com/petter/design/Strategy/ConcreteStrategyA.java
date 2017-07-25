package com.petter.design.Strategy;

/**
 * 具体策略类
 * @author hongxf
 * @since 2017-07-25 17:40
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("采用策略A");
    }
}
