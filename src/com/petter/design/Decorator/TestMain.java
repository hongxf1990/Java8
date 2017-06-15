package com.petter.design.Decorator;

/**
 * @author hongxf
 * @since 2017-06-15 14:48
 */
public class TestMain {
    public static void main(String[] args) {
        //透明装饰模式
        //在实现透明装饰模式时，要求具体装饰类的operation()方法覆盖抽象装饰类的operation()方法
        //除了调用原有对象的operation()外还需要调用新增的addedBehavior()方法来增加新行为
        Component B = new ConcreteComponentB();
        Component DA = new ConcreteDecoratorA(B);
        Component DB = new ConcreteDecoratorB(DA);
        DB.operation();

        System.out.println("----------------------");
        //半透明装饰模式
        //在实现半透明的装饰模式时，我们只需在具体装饰类中增加一个独立的addedBehavior()方法来封装相应的业务处理，
        //由于客户端使用具体装饰类型来定义装饰后的对象，因此可以单独调用addedBehavior()方法来扩展系统功能。
    }
}
