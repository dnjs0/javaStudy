@startuml

'다이어그램 내용 작성
'단일 라인 주석


/' 

	다중라인 주석
	
'/

'클래스 표기
'-사각형으로 표현한다.
'-상단에 클래스 명을 작성한다.
'class 클래스 명

class 클래스1{
	멤버변수
	멤버메서드()
}

class 클래스2{
	- 멤버변수[private]
	# 멤버변수[protected]
	~ 멤버변수[default]
	+ 멤버변수[public]
	+ 메서드()
	- 메서드()
	+ 메서드(이름, 나이)
}

note bottom of 클래스2 : 접근지정자


abstract class 추상클래스


'상속관계
class 부모클래스 {
	+ 이름
	+ 나이

}

class 자식클래스{
	+주소
	+연락처
}
class 부모클래스2 {
	+ 이름
	+ 나이

}

class 자식클래스2{
	+주소
	+연락처
}

부모클래스2 <|-- 자식클래스2

interface 인터페이스1

class 클래스3 implements 인터페이스1




/'

클래스간의 관계

1. 상속,extends 관계
	클래스 <|-- 클래스
	
2. 구현, implements 관계
	인터페이스 <|.. 클래스
	
3. 연관, Association 관계
	클래스 --> 클래스

4. 집합, Aggregation 관계
	클래스 o-- 클래스

5. 합성, Composition 관계
	클래스 *-- 클래스
	
6. 기능명세서(여유~ 초간단)

7. 데이터 구조	

'/

'인터페이스
interface Vehicle {
	+ {abstract} move()
}

'추상클래스
abstract class Animal{
	-name
	+eat()
}

'일반 클래스
class Car{
	-Engine engine
	-Wheel[] wheels
	+start()
}

class Engine{
	-power
	+run()
}

class Wheel{
	-size
}

class Driver{
	- license
	+ drive(Car car)	
}

class Bird{
	+ fly()
}

'관계표현
Animal <|-- Bird : 상속

Vehicle <|.. Car : 구현

Car *-- Engine : 합성

Car o-- Wheel : 집합

Car ..> Driver : 의존

'합성 : car가 없어지면 engine도 없어짐, 의존성 높음

'클래스 다이어그램 > 클래스 구현
'	-  설계도

'클래스 구현 > 클래스 다이어그램
'	- 시스템 분석용

@enduml