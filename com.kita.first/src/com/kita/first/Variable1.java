package com.kita.first;

public class Variable1 {
	public static void main(String[]args) {
		char v1; //문자하나를 저장
		v1 = 'A'; //문자하나를 저장할 때 작은따옴표로 묶는다.
//		char v1_1;
//		v1_1 = 'a';
		
		
		byte v2 = (byte)128;
		//System.out.println(v2);
		short v3;
		int v4;
		long v5;
		
		float v6 = 10.1f;
		double v7 = 10.1;
		System.out.println(v6);
		boolean v8;
		v8 = true;
		v8 = false;
		
		
		int num1 = 5;
		System.out.println(num1);
		num1 = 8;
		System.out.println(num1);
		int n1, n2, n3; //여러 개 변수 이런 식으로 한줄에 잡을 수 있음
		
		final int NUM2 = 6; //final int는 상수 선언
		System.out.println(NUM2);
		//NUM2 = 7; 오류
		
		
		String v9 = "안녕하세요."; //String(문자열 type) 여러 문자 저장. 큰 따옴표로 묶는다. 참조변수(첫 단어가 대문자), 일반변수는  첫 단어가 소문자
		System.out.println(v9);
		
		Variable1 v;
		
	}
}
