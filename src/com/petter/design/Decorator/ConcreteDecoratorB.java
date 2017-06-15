package com.petter.design.Decorator;

/**
 * @author hongxf
 * @since 2017-06-15 14:26
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    public void addedBehavior() {
        System.out.println("添加的行为B");
    }
}
