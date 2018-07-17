package com.naonao.first;

/**
 *
 * 客户端角色类
 * @author HuangHaodong
 * @create 2018-07-17 6:43 PM
 **/
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }

}
