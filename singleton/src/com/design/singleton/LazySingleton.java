package com.design.singleton;

/**
 * 懒汉式单例模式
 * (在多线程下不能保证创建的实例是唯一的)
 * Created by geguofeng on 2017/12/27.
 */
public class LazySingleton {

    private LazySingleton(){}

    //和饿汉式不同，这里不实例化，而是在需要的时候再去new
    private static LazySingleton instance;

    //在多线程下不能保证创建的实例是唯一的
    public static LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
