package com.ensao.java.advanced.types;

@SuppressWarnings("all")


public class PatternMatching {
	public static String[] split(Object o) {
		final String[] split;
		if (o instanceof String h) {
			split = h.split(".");
			return split;
		} else {
			split = new String[]{};
		}
		return split;
	}
}
