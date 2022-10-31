package com.ensao.java.advanced;

@FunctionalInterface
interface MessageFormatter {
	String format(String message);
}

@FunctionalInterface
interface ObjectFormatter {
	String format(Object message);
}

public class MessageFormatting {
	private static void printMessageInFormat(String message, MessageFormatter formatter) {
		System.out.println(formatter.format(message));
	}
	
	private static void printMessageInFormat(String message, ObjectFormatter formatter) {
		System.out.println(formatter.format(message));
	}
	
	public static void main(String[] args) {
		
		String message = "this is a message";
		MessageFormatting instance = new MessageFormatting();
		ObjectFormatter formatter = ( o ) -> {return instance.printAsXML(o);};
		
		printMessageInFormat(message, formatter);
		
		
	}
	
	public String printAsXML(String message) {
		return String.format("<message> %s </message>", message);
	}
	
	public  String printAsXML(Object message) {
		return String.format("<message> %s </message>", message);
	}
}

