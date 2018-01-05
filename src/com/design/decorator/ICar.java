package com.design.decorator;

/**
 * Created by Administrator on 2018/1/6.
 */
public interface ICar {

    public void move();
}

class Car implements ICar{

    @Override
    public void move() {
        System.out.println("car is move...");
    }
}

//装饰器
class SuperCar implements ICar{

    private ICar car;

    public SuperCar(ICar car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

//具体装饰角色
class AICar extends SuperCar{

    public AICar(ICar car) {
        super(car);
    }

    public void autoMove(){
        System.out.println("自动跑...");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}
