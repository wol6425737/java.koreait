package com.kita.first.practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		// 1~3까지 랜덤으로 메뉴뽑기를 한 번 한 후에!
		// 뽑힌 메뉴 : o o
		// 마음에 들면 Y 눌러서 반복 끝내고
		// "오늘의 메뉴는 o o 입니다."
		// 마음에 안 들면 N눌러서 다시 랜덤 뽑기
		Scanner scan = new Scanner(System.in);
		String menu;

		do {
			//메뉴 뽑기
			int rNum = (int)(Math.random()*3)+1;
			
			if(rNum == 1) {
				menu = "한식";
			}
			else if(rNum == 2) {
				menu = "중식";
			}
			else {
				menu = "일식";
			}

			System.out.println("뽑힌 메뉴: " + menu);
			System.out.print("마음에 듭니까?(Y/N)");
			String result = scan.next();
			if("Y".equals(result)) {
				break;
			}

		}while(true);
		
		scan.close();
		System.out.printf("오늘의 메뉴는 %s입니다.",menu);

		
		}
	
	}

	


