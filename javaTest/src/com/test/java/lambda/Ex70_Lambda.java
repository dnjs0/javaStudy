package com.test.java.lambda;

import java.util.Calendar;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.test.java.collection.User;

public class Ex70_Lambda {
	public static void main(String[] args) {
		
		/*
		 * 람다식 > 익명객체의 추상 메서드 > 인터페이스의 참조변수에 저장 
		 * 					> 람다식을 사용하려면 반드시 인터페이스가 필요하다!!!
		 * 람다식의 가장 큰 장점 : 간단한 표현(생산성)
		 * 람다식의 가장 큰 단점 : 인터페이스를 선언해야 한다.
		 * 
		 * (***) 자바에서는 여러가지 형식의 추상메서드(= 람다식 구현용)를 가진 인터페이스를 미리 제공한다.
		 * 					 > 함수형 엔터페이스(Functional interface)
		 * 
		 *  함수형 인터페이스(Functional Interface)
		 *  	- 평범한 일반 인터페이스
		 *  	- 제약 > 추상메서드 딱 1개 소유
		 *  	- 목적 > 람다식을 저장한다.(*****)
		 *  	1. 표준 API 함수형 인터페이스 > JDK에서 미리 만들어준거
		 * 		2. 사용자 정의 함수형 인터페이스 > 개발자가 선언한거
		 * 
		 *  표준 API 함수형 인터페이스, 다 기억하기
		 *  1. Consumer : 매개변수 O , return X
		 *  	- ParameterNoReturn
		 *  	- MultiParameterNoReturn
		 *  2. Supplier : 매개변수 X , return O
		 *  	- NoParameterReturn
		 *  3. Function
		 *  	- ParameterReturn
		 *  4. Operator
		 *  	- ParameterReturn
		 *  5. Predicate
		 *  	- ParameterReturn
		 *  
		 *  
		 * 
		 */
		
		
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
		
	}//main

	private static void m5() {
		//Predicate
		// - Function 하위셋
		// - 매개변수를 받아서 조작 후 결과(반드시 boolean)를 반환하는 행동
		// - 매개변수O, 반환값 O 	> 추상 메서드 1개를 가진다.
		//							> testXXX() 추상 메서드
		// - 논리 검사 > Boolean 반환
		
		Function<Integer, Boolean> f1 = num -> num>0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Predicate<Integer> p1 = num -> num>0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(-10));
		
		BiPredicate<String,String> b2 = (str1, str2) -> str1.length()>str2.length();
		System.out.println(b2.test("홍길동님", "홍길동"));
		
		
		
	}

	private static void m4() {
		//Operator, 연산자
		// - Function 하위셋
		// - 매개변수를 받아서 조작(연산) 후 결과를 반환하는 행동
		// - 매개변수O, 반환값 O 	> 추상 메서드 1개를 가진다.
		//							> applyXXX() 추상 메서드 
		// - 매개변수 자료형과 반환값의 자료형이 동일하다(***)
		
		BiFunction<Integer, Integer, Integer> f1 = (a,b) -> a+b;
		System.out.println(f1.apply(20, 30));
		
		BinaryOperator<Integer> o1 = (a,b) -> a+b;
		System.out.println(o1.apply(30, 40));
		
		Function<String,String> f2 = str -> str.substring(0,1);
		System.out.println(f2.apply("홍길동"));
		
		UnaryOperator<String> o2 = str -> str.substring(0,1);
		System.out.println(o2.apply("아무개"));
		
		
		
	}

	private static void m3() {
		//Function
		//	- Function<T,R> R : return
		//	- BiFunction<T,U,R>
		//	- 매개변수O, 반환값 O 	> 추상 메서드 1개를 가진다.
		//							> applyXXX() 추상 메서드
		
		Function<Integer, Boolean> f1 = num -> num >0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Function<String, Integer> f2 = str -> str.length();
		System.out.println(f2.apply("홍길동 입니다."));
		
		BiFunction<Integer, Integer, String> f3 = (a,b) ->{
			if(a>b) {
				return "크다";
			}else if(a<b) {
				return "작다";
			}else {
				return "같다";
			}
		};
		System.out.println(f3.apply(10, 5));
		System.out.println(f3.apply(5, 10));
		System.out.println(f3.apply(10, 10));
		
		//double이 반환값 int가 매개변수
		IntToDoubleFunction f4 = num -> num/1.0;
		System.out.println(f4.applyAsDouble(5));
		
	}

	private static void m2() {
		//Supplier
		// - Supplier<T>
		// - ...
		// - 매개변수 X, 반환값 O 	> 추상메서드를 1개 가진다.
		//							> getXXX() 추상 메서드
		
		Supplier<Integer> s1 = () -> {return 100;};
		System.out.println(s1.get());
		
		Supplier<Integer> s2 = () -> 200;
		System.out.println(s2.get());
	
		Supplier<Double> s3= () -> Math.random();
		System.out.println(s3.get());
		
		Supplier<String> s4 = () ->"홍길동";
		System.out.println(s4.get());
		
		Supplier<Integer> s5 = () ->{
			Calendar now = Calendar.getInstance();
			return now.get(Calendar.HOUR_OF_DAY); //14
		};
		System.out.println(s5.get());
		
		BooleanSupplier s6 = () ->true;
		
	}

	private static void m1() {
		//Consumer
		//	- Consumer<T> : 매개변수 1개
		//	- BiConsumer<T,U>
		//	- ..
		//	- 매개변수 O, 반환값 X  	> 추상 메서드를 1개 가진다.
		//							> acceptXXX() 추상메서드
		
		//요구사항 ] int 1개를 매개변수 + 반환값 X > 메서드 구현+ 람다식
		MyConsumer m1 = num -> System.out.println(num);
		m1.test(10);
		m1.test(20);
		System.out.println();
		
		//메서드 구현
		Consumer<Integer> c1 = t ->System.out.println(t);;
		c1.accept(20);
		
		Consumer<Integer> c2 = num -> System.out.println(num*num);
		c2.accept(10);
		
		Consumer<String> c3 =str -> System.out.println(str.length());
		c3.accept("홍길동입니다.");
		
		Consumer<Integer> c4 = count -> {
			for(int i=0; i<count; i++) {
				System.out.println(i);
			}
			System.out.println();
		};
		c4.accept(5);
		
		Consumer<User> c5 = user -> {
			System.out.println(user.getName());
			System.out.println(user.getCity());
		};
		c5.accept(new User("홍길동",1,2024,10,10,"서울"));
		
		BiConsumer<String, Integer> bc1 = (name, age) -> {
			System.out.printf("이름 : %s, 나이 : %d세\r\n",name,age);
		};
		bc1.accept("홍길동", 20);
		
		BiConsumer<Integer, Integer> bc2 = (a,b) ->System.out.println(a+b);
		bc2.accept(100, 200);
		System.out.println();
		
		//Consumer<T> : 범용
		//BiConsumer<T,U> : 범용
		
		//Consumer<Integer>
		// = IntConsumer : 전용
		IntConsumer ic1 = num -> System.out.println(num);
		ic1.accept(10);
		
	}//main
	
	
}//class

interface MyConsumer{
	//Input(O), Output(X) > 소비활동
	void test(int num);
}























