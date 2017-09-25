package com.petter.design.Command;

/**
 * @author hongxf
 * @since 2017-06-20 14:11
 */
public class ConcreteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("具体命令执行者");
    }
}
