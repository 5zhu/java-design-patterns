package com.design.strategy;
/**
 * 策略模式代表了解决一类算法的通用解决方案，你可以在运行时选择使用哪种方案。
 * @author geguofeng
 * 策略接口
 */
public interface ValidationStrategy {
	
	/**
	 * 验证字符串是否符合规则
	 * @param str
	 * @return
	 */
	public boolean validate(String str);

}
