package com.design.prototype;

import java.util.Hashtable;

/**
 * Created by Administrator on 2018/2/2.
 */
public class ShapeCache {

    private static Hashtable<Integer, Shape> shapeMap
            = new Hashtable<Integer, Shape>();

    public static Shape getShape(int shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(1);
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId(2);
        shapeMap.put(square.getId(),square);
    }
}
