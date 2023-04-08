package com.main.java.decorator;

public class Mocha extends CondimentDecorator {
	
	//Instance variable to hold the beverage we are wrapping
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public double cost() {
		return 0.20 + beverage.cost();
	}
}
