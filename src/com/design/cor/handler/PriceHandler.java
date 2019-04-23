package com.design.cor.handler;

/**
 * 价格处理人，负责处理折扣申请的抽象类
 */
public abstract class PriceHandler {

    /**
     * 直接上级，用于传递请求，无权限处理时交给上级处理
     */
    protected PriceHandler successor; //采用链表接口，指向自身引用，

    public void setSuccessor(PriceHandler priceHandler){
        this.successor = successor;
    }

    public abstract void processDiscount(float discount);

}
