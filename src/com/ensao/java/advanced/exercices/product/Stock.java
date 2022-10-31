package com.ensao.java.advanced.exercices.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("all")
public class Stock extends TreeSet<Product> {
	private static final ProductComparator COMPARATOR = new ProductComparator();
	
	public Stock(Comparator<Product> comparator) {
		super(comparator);
	}
	
	private Stock() {
		this(COMPARATOR);
	}
	
	public Stock filter(Predicate<Product> predicate) {
		return this.stream()
				.filter(predicate)
				.collect(Collectors.toCollection(Stock::new));
	}
	public Stock invertedFilter(Predicate<Product> predicate) {
		return filter(predicate.negate());
	}
	
	public Stock combine(Predicate<Product> predicateA, Predicate<Product> predicateB ) {
		return filter(predicateA.and(predicateB));
	}
	
	public void discount(Discount discount) {
		Consumer <Product> consumer=product -> {
			product.setPrice(discount.discount(product));
		};
		stream().forEach(consumer);
		throw new ToBeCompletedException("apply a discount function " +
				" do not apply discount if discount amount is > 1 or < 0");
	}
	
	public <R> Collection<R> map(Function<Product, R> mapper) {
		throw new ToBeCompletedException("Retrun a collection of mapped property " +
				"of type 'R' of a product");
	}
	
	public void print(ProductPrinter printer) {
		super.stream()
				.forEach( product -> {
					printer.print(product);
				});
	}
	
	public Map<String, List<Product>> groupByCategory() {
		Map<String, List<Product>> map = new LinkedHashMap<>();
		for (Product p : this){
			List<Product> products = map.get(p.getCategory());
			if(products == null){
				products = new ArrayList<>();
				map.put(p.getCategory(), products);
			}
			
			products.add(p);
			
		}
		 stream().collect(Collectors.groupingBy(Product::getCategory));
		 
		 return map;
	}
	
	public Optional<Product> findProduct(String name) {
		return stream()
				//.filter(product -> product.getName().equals(name))
				.findFirst();
	}
	
	public Stock moreExpensiveThan(Product product) {
		throw new ToBeCompletedException("return a new Stock of products" +
				" that are more expensive that a given product");
	}
	
	public Collection<Product> sorted() {
		return stream()
				.sorted()
				.collect(Collectors.toList());
	}
}
