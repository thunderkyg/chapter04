package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	
	public static void main(String[] args) {
		
		//HashSet 만든다
		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = 4;
		Integer i02 = 5;
		Integer i03 = 6;
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		
		System.out.println(iSet.size());
		
		System.out.println(iSet.toString());
		System.out.println("----------------------------");
		for(Integer num : iSet) {
			System.out.println(num.toString());
		}
		System.out.println("----------------------------");
		
		//중복값을 넣는다.
		Integer i04 = 5;
		iSet.add(i04);
		for(Integer num : iSet) {
			
		}
		
		
	}

}
