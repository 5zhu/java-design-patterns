package com.design.proxy;

import java.util.Random;

/**
 * 没有代理的实现方式
 * Created by geguofeng on 2017/12/29.
 */
public class Car implements Moveable {

    @Override
    public void move() {
        //实现开车的过程
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
