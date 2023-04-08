package com.main.java.decorator;

public class CoffeeShop {
	
	public static void main(String[] args) {
		
		//Order expresso with no condiments
		Beverage beverage = new Expresso();
		System.out.println(beverage.getDescription()+" $" + beverage.cost());
		
		//Order dark roast with double mocha and whip
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()+" $" + beverage2.cost());
	}

}
