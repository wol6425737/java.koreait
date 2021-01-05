package com.kita.first.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수학 응시 유형을 입력해 주세요: (가/나)");
		String str = scan.next();
		

		int defaultScore = 70;
		
	if("가".equals(str)||"나".equals(str)) {
		System.out.println("점수를 입력해 주세요: ");
		int num = scan.nextInt();
		if("가".equals(str)) {
				defaultScore = 60;
			if(num > defaultScore) {
				System.out.println("평균 초과입니다.");
				}
			else if(num < defaultScore) {
				System.out.println("평균 이하입니다.");
				}
			else {
				System.out.println("평균입니다.");
			}
		}
		else if("나".equals(str)) {
				defaultScore = 70;
			if(num > defaultScore) {
				System.out.println("평균 초과입니다.");
				}
			else if(num < defaultScore) {
				System.out.println("평균 이하입니다.");
				}
			else {
				System.out.println("평균입니다.");
			}
		
	}

		}
		else{
			System.out.println("잘못 입력하셨습니다.");
		}
		
		scan.close();
		
		


		
		
		
		
		
		
		
		
		
		
	}

}
