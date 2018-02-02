package com.design.prototype;

/**
 * Created by Administrator on 2018/2/2.
 */
public class Square extends Shape {

    public Square(){
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
