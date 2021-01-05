package com.kita.first.practice;

public class Practice07 {
	public static void main(String[] args) {
		// 1~6 총 6개의 메뉴 랜덤 뽑기
		
		int rNum = (int)(Math.random()*6)+1;
		if(rNum == 1) {
			System.out.println("q");
		}
		else if(rNum == 2) {
			System.out.println("h");
		}
		else if(rNum == 3) {
			System.out.println("g");
		}
		else if(rNum == 4) {
			System.out.println("f");
		}
		else if(rNum == 5) {
			System.out.println("z");
		}
		else
			System.out.println("d");
		}
		
		
		
	}


