package com.ensao.java.advanced.generics;

import java.util.ArrayList;

@SuppressWarnings("all")
public class Generics {
	
	public static void main(String[] args) {
		
		ArrayList<String> stringArrayList = new ArrayList<String>();
		
		methodeGenerique(50);
		
		
	}
	
	public static <T> void methodeGenerique(T object){
	
	}
}
