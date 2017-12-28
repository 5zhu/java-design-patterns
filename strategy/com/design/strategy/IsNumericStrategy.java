package com.design.strategy;

/**
 * 策略2：验证是否是数字
 * @author geguofeng
 *
 */
public class IsNumericStrategy implements ValidationStrategy {

	@Override
	public boolean validate(String str) {
		 
		return str.matches("\\d+");
	}

}
