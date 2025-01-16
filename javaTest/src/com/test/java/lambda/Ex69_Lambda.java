package com.test.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Ex69_Lambda {
	public static void main(String[] args) {
		
		// 람다식 사용 예 == 익명 객체 사용 예
		//	> 배열, 컬렉션 정렬 >sort(익명 객체)
		
		Random rnd = new Random();
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i = 0;i <10; i++) {
			nums.add(rnd.nextInt(50)+1); //1~50사이의 난수
		}
		System.out.println(nums);
		
		
		//오름차순 정렬
		//Collections.sort(nums);
		//System.out.println(nums);
		
		//내림차순 정렬
		Collections.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1;
			}
			
		});
		
		//오름차순 람다식
		Collections.sort(nums,(o1,o2)->o1-o2);
		
		//내림차순
		nums.sort((n1,n2) ->n2-n1);
		
		System.out.println(nums);
		
		
		
		
	}//main
}//class

















