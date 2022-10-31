package com.ensao.java.advanced;


interface Operation {
	Integer calculer(Integer a, Integer b);
}

public class Calculatrice {
	private static Integer performOperation(Integer a, Integer b, Operation operation) {
		return operation.calculer(a, b);
	}
	
	public static void main(String[] args) {
		Operation addition = (a, b) -> a + b;
		Integer resultOfAddition = performOperation(1, 5, addition);
		
		System.out.println(resultOfAddition);
		
		Integer resultOfDivision = performOperation(1, 5, (a, b) -> a / b);
		
		System.out.println(resultOfDivision);
		
		
	}
}


