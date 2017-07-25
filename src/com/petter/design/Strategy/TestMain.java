package com.petter.design.Strategy;

/**
 * @author hongxf
 * @since 2017-07-25 17:42
 */
public class TestMain {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.algorithm();

        Context context1 = new Context(new ConcreteStrategyB());
        context1.algorithm();
    }
}
