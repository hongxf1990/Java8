package com.petter.design.Decorator;

/**
 * @author hongxf
 * @since 2017-06-15 14:26
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    public void addedBehavior() {
        System.out.println("添加的行为A");
    }
}
