package com.petter.design.Builder;

/**
 * 建造者模式(Builder Pattern)：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 建造者模式是一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象的类型和内容就可以构建它们，用户不需要知道内部的具体构建细节。
 * 建造者模式属于对象创建型模式。根据中文翻译的不同，建造者模式又可以称为生成器模式。
 *
 * 建造者模式的简化:
 * 省略抽象建造者角色：如果系统中只需要一个具体建造者的话，可以省略掉抽象建造者。
 * 省略指挥者角色：在具体建造者只有一个的情况下，如果抽象建造者角色已经被省略掉，那么还可以省略指挥者角色，让Builder角色扮演指挥者与建造者双重角色。
 * @author hongxf
 * @since 2017-06-14 11:02
 */
public interface Builder {

    void builderPartA();
    void builderPartB();
    Product getProduct();
}
