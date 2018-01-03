package com.design.proxy;

/**
 * 使用聚合方式实现代理
 * Created by geguofeng on 2017/12/29.
 */
public class Car3 implements Moveable{

    //携带一个car
    private Car car;

    public Car3(Car car){
        super();
        this.car = car;
    }

    @Override
    public void move() {
        //记录一下汽车行驶的时间
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        car.move();
        long endTime = System.currentTimeMillis();
        long res = endTime - startTime;
        System.out.println("汽车行驶结束...,共行驶"+res+"毫秒");

    }

    public static void main(String[] args) {
        Car car = new Car();
        Moveable car3 = new Car3(car);
        car3.move();
    }
}
