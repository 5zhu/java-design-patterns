package com.design.singleton;

/**
 * 内部类实现单例模式
 * Created by geguofeng on 2017/12/27.
 */
public class InnerClassSingleton {

    public static Singleton getInstance(){
        return Singleton.singleton;
    }

    private static class Singleton{
        protected static Singleton singleton = new Singleton();
    }

}
