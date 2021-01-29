package com.kita.first.level3;

public abstract class Animal extends Object {//abstract 추상 클래스 붙이면 새 인스턴스 못만들고 상속만 받을 수 있다.
	//필드
	String name = "동물";
	
	//생성자
	Animal(){
		super();
	}
	
	//메소드
	abstract void crying();
	//메소드에 abstract 붙이면 상속받은 클래스에서 무조건적으로 메소드를 override해야 실행이 되도록 한다.
	
//	void crying() {
//		System.out.println("동물이 운다.");
//	}

}
