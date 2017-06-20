package com.petter.design.Flyweight;

/**
 * 实现了抽象享元类，其实例称为享元对象；在具体享元类中为内部状态提供了存储空间。通常我们可以结合单例模式来设计具体享元类，为每一个具体享元类提供唯一的享元对象。
 * @author hongxf
 * @since 2017-06-20 9:29
 */
public class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(String extrinsicState) {
        System.out.println("内部值--" + intrinsicState);
        //由于外部值是private的，所以无法共享
        System.out.println("外部值--" + extrinsicState);
    }

}
