package com.main.java.decorator;

public class Whip extends CondimentDecorator{

	//Instance variable to hold the beverage we are wrapping
		Beverage beverage;
		
		public Whip(Beverage beverage) {
			this.beverage = beverage;
		}
		
		public String getDescription() {
			return beverage.getDescription() + ", Whip";
		}
		
		public double cost() {
			return 0.10 + beverage.cost();
		}
}
