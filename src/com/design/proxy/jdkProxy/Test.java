package com.design.proxy.jdkProxy;

import com.design.proxy.Car;
import com.design.proxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/1/3.
 */
public class Test {

    public static void main(String[] args) {
        Car car = new Car();

        InvocationHandler invocationHandler = new TimeHandler(car);

        Class<?> cls = car.getClass();

        Moveable moveable = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), invocationHandler);

        moveable.move();

    }

}
