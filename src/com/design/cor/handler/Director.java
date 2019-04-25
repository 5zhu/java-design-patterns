package com.design.cor.handler;

public class Director extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.4) {
            System.out.format("%s批准了：%。2f%n", this.getClass(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
