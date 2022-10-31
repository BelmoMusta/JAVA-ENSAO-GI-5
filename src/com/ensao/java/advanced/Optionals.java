package com.ensao.java.advanced;

import java.util.Optional;

public class Optionals {
	public static void main(String[] args) {
		
		Integer intValue = null;
		Optional<Integer> optionalInt = Optional.ofNullable(intValue);
		String intAsString = optionalInt
				.filter(value -> value > 0)
				.map(value -> String.valueOf(value))
				.map(strValue -> String.format("[ %s ]", strValue))
				.orElse("");
				
		
	}
}

