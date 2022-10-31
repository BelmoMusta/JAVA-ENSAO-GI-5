package com.ensao.java.advanced.exercices.product;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
	public final boolean byPrice;
	
	public ProductComparator() {
		this.byPrice = false;
	}
	
	public ProductComparator(boolean byPrice) {
		this.byPrice = byPrice;
	}
	
	@Override
	public int compare(Product productA, Product productB) {
		Comparator<Product> monComparateur = (a,  b) ->  a.getPrice().compareTo(b.getPrice());
		
		if(byPrice){
			int resultat = monComparateur.compare(productA, productB);
			if(resultat == 0){
				return 1;
			}
			return resultat;
			//return Comparator.comparing(Product::getPrice).compare(productA, productB);
			//return (int) (productA.getPrice() - productB.getPrice());
		}
		return Comparator.comparing(Product::getName).compare(productA, productB);
		//return productA.getName().compareTo(productB.getName());
		
	}
}
