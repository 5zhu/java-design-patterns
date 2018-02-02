package com.design.prototype;

/**
 * Created by Administrator on 2018/2/2.
 */
public class Circle extends Shape {

    public Circle(){
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
