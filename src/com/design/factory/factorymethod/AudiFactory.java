package com.design.factory.factorymethod;

import com.design.factory.base.Audi;
import com.design.factory.base.Car;

/**
 * Created by Administrator on 2017/12/28.
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
