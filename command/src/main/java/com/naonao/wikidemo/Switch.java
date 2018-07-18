package com.naonao.wikidemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * The Invoker class
 * @author HuangHaodong
 * @create 2018-07-18 1:46 PM
 **/
class Switch {

    private List<Command> history = new ArrayList<>();

    void storeAndExecute(final Command command) {
        this.history.add(command);
        command.execute();
    }

}
