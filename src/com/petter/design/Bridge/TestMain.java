package com.petter.design.Bridge;

/**
 * @author hongxf
 * @since 2017-06-15 9:44
 */
public class TestMain {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImpl(new ConcreteImplementorA());
        abstraction.operation();

        Abstraction abstraction1 = new RefinedAbstractionB();
        abstraction1.setImpl(new ConcreteImplementorB());
        abstraction1.operation();
    }
}
