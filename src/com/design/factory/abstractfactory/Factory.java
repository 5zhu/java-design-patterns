package com.design.factory.abstractfactory;

/**
 * Created by Administrator on 2017/12/29.
 */
public class Factory implements IProductFactory {
    @Override
    public IProductA createProductA() {
        return new ProductA();
    }

    @Override
    public IProductB createProduct() {
        return new ProductB();
    }
}
