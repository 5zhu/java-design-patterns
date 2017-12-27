package com.design.singleton;

/**
 * 饿汉式单例模式
 *
 * Created geguofeng by  on 2017/12/27.
 */
public class HungrySingleton {

    //将构造函数私有化，不允许外部对象直接调用
    private HungrySingleton(){}

    private static HungrySingleton instance = new HungrySingleton();

    //对外提供唯一用于获取实例的方法
    public static HungrySingleton getInstance(){
        return instance;
    }

}
