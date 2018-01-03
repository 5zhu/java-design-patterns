package com.design.proxy.staticProxy;

import com.design.proxy.Moveable;

import java.util.Random;

/**
 * 没有代理的实现方式
 * Created by geguofeng on 2017/12/29.
 */
public class CarNoProxy implements Moveable {

    @Override
    public void move() {
        //记录一下汽车行驶的时间
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        //实现开车的过程
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long res = endTime - startTime;
        System.out.println("汽车行驶结束...,共行驶"+res+"毫秒");
    }
}
