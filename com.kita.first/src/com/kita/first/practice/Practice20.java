package com.kita.first.practice;

public class Practice20 {
	public static void main(String[] args) {
		// while문에 조건식을 사용하여
		// 1~100을 모두 더한 값이 출력되도록 하세요
		// 합계 : 5050
	int i = 0;
	int n = 1;
	while(n<=100) {
		i+=n;
		n++;
		}
	System.out.printf("합계: %d",i);
	}
	
}
