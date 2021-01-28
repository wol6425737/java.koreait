package com.kita.first.level3;

public class Animal extends Object {//abstract 추상 클래스 붙이면 새 인스턴스 못만들고 상속만 받을 수 있다.
	Animal(){
		super();
	}
	void crying() {
		System.out.println("동물이 운다.");
	}

}
