package com.lc.behavioralPattern.command;

import java.util.List;

/**
 * @Author Lc
 * @Date 2023/4/12
 * @Description
 */
public class Waitor {
    private List<Command> command;

    public void setCommands(List<Command> command) {
        this.command = command;
    }

    void OrderUp(Command command){
        command.execute();
    }
}
