package com.naonao.wikidemo;

/**
 *
 * The test class or client
 * @author HuangHaodong
 * @create 2018-07-18 1:52 PM
 **/
public class PressSwitch {

    public static void main(String[] args) {
        if (args.length != 1) {
            // Check number of arguments
            System.err.println("Argument \"ON\" or \"OFF\" is required.");
            System.exit(-1);
        }

        final Light light = new Light();
        final Command switchUp = new FlipUpCommand(light);
        final Command switchDown = new FlipDownCommand(light);
        final Switch mySwitch = new Switch();
        switch (args[0]) {
            case "ON":
                 mySwitch.storeAndExecute(switchUp);
                break;
            case "OFF":
                mySwitch.storeAndExecute(switchDown);
                break;
            default:
                System.err.println("Argument \"ON\" or \"OFF\" is required.");
                System.exit(-1);
        }
    }
}
