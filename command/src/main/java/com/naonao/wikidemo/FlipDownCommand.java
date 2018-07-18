package com.naonao.wikidemo;

/**
 *
 * The Command for turning off the light -ConcreteCommand
 * @author HuangHaodong
 * @create 2018-07-18 1:51 PM
 **/
public class FlipDownCommand implements Command {

    private Light light;

    FlipDownCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
