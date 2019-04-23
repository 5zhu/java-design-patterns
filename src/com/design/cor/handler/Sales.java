package com.design.cor.handler;

/**
 * SE 可批准5%内的折扣
 */
public class Sales extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if(discount <= 0.05){
            System.out.format("%s批准了折扣：%2.f%n", this.getClass().getName(), discount);
        }else {
            successor.processDiscount(discount);
        }
    }
}
