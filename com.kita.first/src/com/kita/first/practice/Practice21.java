package com.kita.first.practice;

import java.util.Scanner;

public class Practice21 {
	public static void main(String[] args) {
		// 컴퓨터가 뽑은 랜덤 수 (10 ~ 90)
		// Up&Down
		// Great!
		Scanner scan = new Scanner(System.in);
		int max = 90;
		int min = 10;
		int rNum = (int)(Math.random()*(max-min+1))+min;;
		while(true) {
			System.out.println("숫자를 입력해주세요:");
			int num = scan.nextInt();
			if(num>max || num<min) {
				System.out.println("잘못 입력하셨습니다.");
			
			}
			else if(rNum > num){
				System.out.println("Down");
				
			}
			else if(rNum < num) {
				System.out.println("Up");
			}
			else {
				break;
			}
			System.out.println("Great!");
			
			
		}
		scan.close();
	}
	

}
