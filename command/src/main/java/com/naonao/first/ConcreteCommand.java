package com.naonao.first;

/**
 *
 * 具体命令角色类
 * @author HuangHaodong
 * @create 2018-07-17 6:40 PM
 **/
public class ConcreteCommand implements Command {

    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
