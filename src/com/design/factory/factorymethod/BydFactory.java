package com.design.factory.factorymethod;

import com.design.factory.base.Byd;
import com.design.factory.base.Car;

/**
 * Created by Administrator on 2017/12/28.
 */
public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}
