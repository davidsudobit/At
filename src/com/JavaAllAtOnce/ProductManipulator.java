package com.JavaAllAtOnce;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ProductManipulator {
	
	public static void main(String args[]) {
		
		Set<Product> products=new TreeSet<>(Comparator.comparing(Product::getLastModified).thenComparing(Comparator.comparing(Product::getProductMfdDate).reversed()));
		
		products.addAll(Arrays.asList(
				
				new Product(1L,"Product01",120.89,LocalDateTime.of(2023, 7, 23, 12, 34),LocalDateTime.of(2023, 6, 22, 11, 33)),
				new Product(2L,"Product02",129.02,LocalDateTime.of(2023, 8, 21, 8, 23),LocalDateTime.of(2023, 7, 20, 3, 34)),
				new Product(3L,"Product03",89.45,LocalDateTime.of(2023, 6, 9, 16, 18),LocalDateTime.of(2022, 1, 11, 1, 45)),
				new Product(4L,"Product04",345.29,LocalDateTime.of(2023, 5, 12, 23, 12),LocalDateTime.of(2022, 1, 11, 1, 45)),
				new Product(5L,"Product05",39.12,LocalDateTime.of(2023, 7, 28, 7, 54),LocalDateTime.of(2023, 2, 16, 21, 31)),
				new Product(6L,"Product06",231.40,LocalDateTime.of(2023, 8, 18, 18, 32),LocalDateTime.of(2023, 10, 27, 23, 59))
				
				));
		
		products.forEach(System.out::println);
		
	}

}
