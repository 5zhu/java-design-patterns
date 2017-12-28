package com.design.singleton;

/**
 * 懒汉式改进 线程安全的单例模式
 * Created by geguofeng on 2017/12/27.
 */
public class SynchronizedSingleton {

    private SynchronizedSingleton(){}

    //和饿汉式不同，这里不实例化，而是在需要的时候再去new
    private static SynchronizedSingleton instance;

    //双重加锁
    public static SynchronizedSingleton getInstance(){
        if(instance == null){
            synchronized (SynchronizedSingleton.class){
                if(instance == null){
                    instance = new SynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
