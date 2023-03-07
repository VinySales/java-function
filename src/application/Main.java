package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Iphone 13", 4000.0));
		list.add(new Product("Iphone X", 2000.0));
		list.add(new Product("Iphone 11", 2500.0));
		list.add(new Product("Iphone 12", 3000.0));
		
		//Function
		List<String> list2 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		list2.forEach(System.out::println);
	}

}
