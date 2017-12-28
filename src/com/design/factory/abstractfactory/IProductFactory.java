package com.design.factory.abstractfactory;

/**
 * Created by Administrator on 2017/12/29.
 */
public interface IProductFactory {

    public IProductA createProductA();

    public IProductB createProduct();
}
