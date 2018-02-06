package com.design.command.ex2;

import com.design.command.ex1.Peddler;

/**
 * Created by gegf on 2018/2/7.
 */
public abstract class Command {

    private Peddler peddler;

    public Command(Peddler peddler) {
        super();
        this.peddler = peddler;
    }

    public Peddler getPeddler() {
        return peddler;
    }

    public void setPeddler(Peddler peddler) {
        this.peddler = peddler;
    }

    public abstract void sail();
}
