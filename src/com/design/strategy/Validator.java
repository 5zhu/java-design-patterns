package com.design.strategy;

/**
 * 测试类
 * @author geguofeng
 *
 */
public class Validator {
	
	private ValidationStrategy validationStrategy;
	
	//携带一个策略
	public Validator(ValidationStrategy validationStrategy){
		this.validationStrategy = validationStrategy;
	}
	
	public Boolean exec(String str){
		return this.validationStrategy.validate(str);
	}
	
	public static void main(String[] args) {
		Validator validatorA = new Validator(new AllLowerCaseStrategy()); 
		System.out.println(validatorA.exec("aaaa"));	
		Validator validatorB = new Validator(new IsNumericStrategy()); 
		System.out.println(validatorB.exec("123"));	
		
		//使用Java8 Lamdba表达式重构
		Validator validatorC = new Validator((String s) -> s.matches("[a-z]+"));
		System.out.println(validatorC.exec("bbb"));
	}
	

}
