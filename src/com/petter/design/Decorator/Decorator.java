package com.petter.design.Decorator;

/**
 * 装饰模式(Decorator Pattern) ：动态地给一个对象增加一些额外的职责(Responsibility)，就增加对象功能来说，装饰模式比生成子类实现更为灵活。
 * 其别名也可以称为包装器(Wrapper)，与适配器模式的别名相同，但它们适用于不同的场合。根据翻译的不同，装饰模式也有人称之为“油漆工模式”，它是一种对象结构型模式。
 *
 * 装饰模式是一种用于替代继承的技术，它通过一种无须定义子类的方式来给对象动态增加职责，使用对象之间的关联关系取代类之间的继承关系。
 * 在装饰模式中引入了装饰类，在装饰类中既可以调用待装饰的原有类的方法，还可以增加新的方法，以扩充原有类的功能。
 * @author hongxf
 * @since 2017-06-15 14:25
 */
public class Decorator implements Component {

    private Component component; //维持一个对抽象构件对象的引用

    public Decorator() {
    }

    public Decorator(Component component) { //注入一个抽象构件类型的对象
        this.component = component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation(); //调用原有业务方法
    }
}
