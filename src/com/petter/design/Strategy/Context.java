package com.petter.design.Strategy;

/**
 * 封装类
 * 也叫上下文，对策略进行二次封装，目的是避免高层模块对策略的直接调用。
 * @author hongxf
 * @since 2017-07-25 17:22
 */
public class Context {
    private Strategy strategy;

    public Context() {
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        strategy.algorithm();
    }
}
