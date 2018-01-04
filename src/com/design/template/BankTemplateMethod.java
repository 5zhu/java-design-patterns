package com.design.template;

/**
 * 抽象基类 定义算法框架，以银行业务为模板
 * * Created by Administrator on 2018/1/3.
 */
public abstract class BankTemplateMethod {

    /**
     * 具体方法
     */
    public void takeNumber(){
        System.out.println("取号排队");
    }

    public abstract void transact(); //具体业务方法

    public void evaluate(){
        System.out.println("反馈评分");
    }

    public final void process(){
        this.takeNumber();
        transact();  //回调
        this.evaluate();
    }
}
