package com.kita.first.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String str = "홀수";
		if (num % 2 == 0) {
			str = "짝수";
			}
		System.out.printf("%s입니다.", str);
		
		scan.close();
		
		
		
		
		
		
	}

}
