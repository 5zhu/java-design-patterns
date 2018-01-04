package com.design.template;

/**
 * Created by Administrator on 2018/1/4.
 */
public class TestClient {

    public static void main(String[] args) {
        BankTemplateMethod btm = new DrawMoney();
        btm.process();

        //2.采用匿名内部类
        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存款");
            }
        };
        btm2.process();

    }
}

//1.定义子类
class DrawMoney extends BankTemplateMethod{

    @Override
    public void transact() {
        System.out.println("我要取款！");
    }
}
