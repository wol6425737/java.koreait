package com.kita.first.practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		// 1 ~ 12월
		// 3 ~ 5월: 봄
		// 6 ~ 8월 : 여름
		// 9~ 11월 : 가을
		// 12~2월 : 겨울
		
		// n월은 oo입니다.
		Scanner scan = new Scanner(System.in);
		String sNum = scan.next();
		scan.close();
		String weather;
		
		
		switch(sNum) {
		case "3": case "4": case "5":
			weather = "봄";
			break;
		case "6": case "7": case "8":
			weather = "여름";
			break;
		case "9": case "10": case "11":
			weather = "가을";
			break;
		case "12": case "1": case "2":
			weather = "겨울";
			break;
		
			
		
		}
		System.out.printf("%s월은 %s입니다.", sNum, weather);
		
		
		
		
	}

}
