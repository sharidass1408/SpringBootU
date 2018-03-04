package com.haridass.spring.basics.springin5stps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StpsApplication {

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//int result = binarySearch.binarySearch(new int[]{12,4,6,3},3);
		//System.out.println(result);
		
		ApplicationContext applicationContext =
							SpringApplication.run(SpringIn5StpsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{12, 4,6},3);
		System.out.println(result);
		SpringApplication.run(SpringIn5StpsApplication.class, args);
		
	}
}
