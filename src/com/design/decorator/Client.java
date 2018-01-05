package com.design.decorator;

/**
 * Created by Administrator on 2018/1/6.
 */
public class Client {

    public static void main(String[] args) {
        ICar car = new Car();
        car.move();

        System.out.println("---增加自动驾驶---");
        AICar aiCar = new AICar(car);
        aiCar.move();
    }
}
