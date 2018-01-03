package com.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题对象
 * Created by Administrator on 2018/1/3.
 */

public class Subject {

    private List<Observer> list = new ArrayList<Observer>();

    public void registerObserver(Observer obs){
        list.add(obs);
    }

    public void removeObserver(Observer obs){
        list.remove(obs);
    }

    public void notifyAllObservers(){
        for (Observer obs : list){
            obs.update(this);
        }
    }
}


