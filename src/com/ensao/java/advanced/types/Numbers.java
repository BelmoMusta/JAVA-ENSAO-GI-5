package com.ensao.java.advanced.types;

import java.math.BigInteger;

public class Numbers {
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static long sumWithCastToLong(int a, int b) {
		return ((long)a) + b;
	}
	
	public static long sum(long a, long b) {
		return a + b;
	}
	
	public static BigInteger sumWithoutOverflow(long a, long b) {
		return BigInteger.valueOf(a).add(BigInteger.valueOf(b));
	}
	
	public static void main(String[] args) {
		System.out.println(sum(Integer.MAX_VALUE , 1)); // overflow : -2147483648
		System.out.println(sumWithCastToLong(Integer.MAX_VALUE , 1)); // correct 2147483648
		System.out.println(sum(Long.MAX_VALUE , 1L)); // overflow -9223372036854775808
		System.out.println(sumWithoutOverflow(Long.MAX_VALUE , 1L)); // correct 9223372036854775808
	}
	
}
