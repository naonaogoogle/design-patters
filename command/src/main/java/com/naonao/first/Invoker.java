package com.naonao.first;

/**
 *
 * 请求者角色类
 * @author HuangHaodong
 * @create 2018-07-17 6:41 PM
 **/
public class Invoker {

    private Command command = null;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
