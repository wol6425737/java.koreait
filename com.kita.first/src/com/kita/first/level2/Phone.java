package com.kita.first.level2;

public class Phone /*extends Object((설명 : Object라는 최상위 클래스를 자동적으로 받는다. 자동으로 되는거라 생략))*/ {
	//필드
	String company = "삼성";
	String name;
	String color;
	int memory;
	
	//생성자
	Phone(){
		//super(); (설명 : Object라는 최상위 클래스를 자동적으로 받는다. 자동으로 되는거라 생략)
		
	}
	Phone(String company){
		this(company, "휴대폰", "검은색", 200);
	}
	Phone(String company, String name){
		this(company, name, "검은색", 200);
	}
	Phone(String company, String name, String color){
		this(company, name, color, 200);
	}
	
	Phone(String company,String name, String color, int memory){ 
		// 필드를 초기화
		this.company = company;
		this.name = name;   //this : 내가 속해있는 객체
		this.color = color;
		this.memory = memory;


}

	//메소드
	String sendMsg(String str) {
		String result = str;
		String blank = "";
		if("".equals(str)) {
			
			result = blank;
		}
		System.out.println(result);
		return result;
		
	}
	void call() {
		
	}
	

}
class Computer{}
