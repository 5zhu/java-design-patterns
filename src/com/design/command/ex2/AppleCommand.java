package com.design.command.ex2;

import com.design.command.ex1.Peddler;

/**
 * Created by gegf on 2018/2/7.
 */
public class AppleCommand extends Command {

    public AppleCommand(Peddler peddler) {
        super(peddler);
    }

    @Override
    public void sail() {
        this.getPeddler().sailApple();
    }
}
