package com.design.strategy;

/**
 * 策略1： 是否都是小写
 * @author geguofeng
 *
 */
public class AllLowerCaseStrategy implements ValidationStrategy {

	@Override
	public boolean validate(String str) {
		return str.matches("[a-z]+");
	}

}
