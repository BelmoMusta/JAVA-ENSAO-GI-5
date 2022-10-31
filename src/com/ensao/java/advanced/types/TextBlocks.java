package com.ensao.java.advanced.types;

import java.util.stream.Stream;

@SuppressWarnings("all")

public class TextBlocks {
	
	public static void main(String[] args) {
		String textBlock = """
				this is a "quoted"
				multiline String
				""";
		System.out.println(textBlock);
		
	"       ".isBlank(); // true
	"      \n ".isBlank(); // true
	"      \t\n ".isBlank(); // true
		
		"     TEST     ".strip(); // removes leading and trailing white spaces
		
		Stream<String> lines = textBlock.lines();
		
		"a ".repeat(20);
		
	}
}
