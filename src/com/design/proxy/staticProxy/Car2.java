package com.design.proxy.staticProxy;

/**
 * 使用继承的实现方式实现代理
 * Created by geguofeng on 2017/12/29.
 */
public class Car2 extends Car {

    @Override
    public void move() {
        //记录一下汽车行驶的时间
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        super.move();
        long endTime = System.currentTimeMillis();
        long res = endTime - startTime;
        System.out.println("汽车行驶结束...,共行驶"+res+"毫秒");
    }

    public static void main(String[] args) {
        Moveable car = new Car2();
        car.move();
    }
}
