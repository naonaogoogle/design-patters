package com.naonao.wikidemo;

/**
 *
 * The Command for turning on the light -ConcreteCommand
 * @author HuangHaodong
 * @create 2018-07-18 1:49 PM
 **/
public class FlipUpCommand implements Command {

    private Light light;

    FlipUpCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
