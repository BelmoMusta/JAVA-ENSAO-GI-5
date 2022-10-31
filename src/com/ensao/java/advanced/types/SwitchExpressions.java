package com.ensao.java.advanced.types;

@SuppressWarnings("all")


public class SwitchExpressions {
	
	private static String convertIntToAlphabet(int y) {
		final String result;
		switch (y) {
			case -1:
			case -2:
				result = "Negative"; break;
			case 0:
				result = "Zero"; break;
			case 1:
				result = "One"; break;
			case 2:
				result = "Two"; break;
			default:
				result = "UNKNOWN";
		} ;
		
		return result;
	}
	
	public static void main0(String[] args) {
		String result = convertIntToAlphabet(4);
		System.out.println(result);
		
	}
	
	
	
	static String patternMatchingSwitch(Product product) {
		
		return switch (product){
			//case null -> "null";
			case ItProduct itProduct -> itProduct.getType();
			case VirtualProduct virtualProduct -> virtualProduct.getLicenseKey();
			case Product aProduct -> "uncategorized product";
		};
	}
	
	public static void main(String[] args) {
		System.out.println(patternMatchingSwitch(new Product()));
	}
	
}

class Product {}

class ItProduct extends Product {
	String getType() {
		return "it";
	}
}

class VirtualProduct extends Product {
	String getLicenseKey() {
		return "444555222";
	}
}
