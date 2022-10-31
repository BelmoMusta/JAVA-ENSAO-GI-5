package com.ensao.java.advanced.exercices.product;

@FunctionalInterface
public interface Discount {
	double discount(Product p);
}
