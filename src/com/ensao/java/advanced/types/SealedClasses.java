package com.ensao.java.advanced.types;

@SuppressWarnings("all")
public class SealedClasses {
	
	sealed interface FoodType permits Food {}
	
	sealed abstract class Food implements FoodType permits Drinks, Sandwich {}
	
	sealed class Drinks extends Food {}
	
	final class Water extends Drinks {}
	
	final class Sandwich extends Food {}
	
	public static void main(String[] args) {
		Object y= 1;
		System.out.println(y.getClass());
	}
	
	
}

