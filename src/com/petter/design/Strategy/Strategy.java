package com.petter.design.Strategy;

/**
 * 抽象策略类
 *
 * 定义一系列算法，将每一个算法封装起来，并让它们可以相互替换。策略模式让算法独立于使用它的客户而变化，也称为政策模式(Policy)。
 * 策略模式是一种对象行为型模式。
 *
 * 策略模式通常把一个系列的算法封装到一系列的策略类里面，作为一个抽象策略类的子类。用一句话来说，就是“准备一组算法，并将每一个算法封装起来，使得它们可以互换”
 * @author hongxf
 * @since 2017-07-25 17:39
 */
public interface Strategy {
    void algorithm();
}
