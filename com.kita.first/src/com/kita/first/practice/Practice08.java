package com.kita.first.practice;

import java.util.Scanner;

public class Practice08 {
	public static void main(String[] args) {
		// 1 ~ 12월
		// 3 ~ 5월: 봄
		// 6 ~ 8월 : 여름
		// 9~ 11월 : 가을
		// 12~2월 : 겨울

		// n월은 oo입니다.
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력해주세요 : (1~12)");
		String month = scan.next();
		scan.close();
		int monthNum = Integer.parseInt(month);// string month를 int형으로 받음

		
		  if(monthNum >= 3 && monthNum <=5) { System.out.println("봄입니다."); } 
		  else if(monthNum >= 6 && monthNum <=8) { System.out.println("여름입니다."); } 
		  else if(monthNum >= 9 && monthNum <=11) { System.out.println("가을입니다.");} 
		  else if(monthNum ==1 || monthNum ==2 || monthNum ==12) {
		  System.out.println("겨울입니다.");
		  
		  }
		  
		 

	}

}
