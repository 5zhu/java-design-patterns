package com.design.prototype;

/**
 * Created by Administrator on 2018/2/3.
 */
public class Demo {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneShape = ShapeCache.getShape(1);
        System.out.println(cloneShape.getType());
    }
}
