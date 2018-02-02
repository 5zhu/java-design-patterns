package com.design.prototype;

/**
 * 创建一个实现了 Clonable 接口的抽象类
 *
 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。
 */
public abstract class Shape implements Cloneable{

    private int id;
    protected String type;

    abstract void draw();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
