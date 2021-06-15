package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	
	public static void main(String[] args) {
		
		
		
		Set<Integer> lottoSet= new HashSet<Integer>();
		
		while(lottoSet.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			lottoSet.add(num); // 중복체크
		}
		
		for(int lottoNo : lottoSet) {
			System.out.println(lottoNo);
		}
		
		System.out.println(lottoSet);
		
//		for (int i = 0; i < 6; i++) {
//			System.out.print((int)(Math.random()*45)+1);
//			System.out.print("	");
//		}
		
	}

}
	