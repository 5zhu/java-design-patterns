package com.design.factory.simplefactory;

import com.design.factory.base.Audi;
import com.design.factory.base.Byd;
import com.design.factory.base.Car;

/**
 * 工厂类
 * Created by geguofeng on 2017/12/28.
 */
public class CarFactory {

    public static Car createCar(String carType){
        if("audi".equals(carType)){
            return new Audi();
        }else if("byd".equals(carType)){
            return new Byd();
        }else{
            return null;
        }
    }

    public static Car createAudi(){
        return new Audi();
    }

    public static Car createByd(){
        return new Byd();
    }
}
