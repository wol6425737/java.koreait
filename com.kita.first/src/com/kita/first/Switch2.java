package com.kita.first;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sNum = scan.next();
		scan.close();
		String menu;
		switch(sNum) {
		case "1": 
			menu = "한식";
			break;
		case "2": case "4":
			menu = "중식";
			break;
		case "3": 
			menu = "일식";
			break;
		default :
			menu = "치킨";
		
		}
		System.out.printf("오늘의 메뉴는 %s입니다", menu);
	}

}
