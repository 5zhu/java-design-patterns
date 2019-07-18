package com.design.adapter.classadpater;

/**
 * 适配器
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {
        int voltage = super.output220V();
        int target = voltage / 44;
        return target;
    }
}
