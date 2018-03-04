package com.haridass.spring.basics.springin5stps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] numbers){
		
		return numbers;
	}

}
