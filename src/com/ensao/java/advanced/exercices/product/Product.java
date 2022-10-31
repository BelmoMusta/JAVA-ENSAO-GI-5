package com.ensao.java.advanced.exercices.product;

public class Product extends AbstractProduct {
	
	@Override
	public Product clone() throws CloneNotSupportedException {
		return new Product(this);
	}
	public Product(){}
	public Product(Product product){
		setPrice(product.getPrice());
		///
	}
	
	
}