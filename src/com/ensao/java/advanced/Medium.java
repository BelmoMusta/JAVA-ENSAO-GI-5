package com.ensao.java.advanced;

public interface Medium {
	void showOutput(String s);
	
	default void f(Medium m) {
		m(this, m);
	}
	
	 static void m(Medium n, Medium m) {
		
	}
}
