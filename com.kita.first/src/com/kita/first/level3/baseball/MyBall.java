package com.kita.first.level3.baseball;

import java.util.Scanner;

public class MyBall {
//내가 숫자값 입력하고 예외 처리하는 클래스
	
	//필드
	int gameCnt;
	private int[] myArr;
	private Scanner scan;


	//생성자
	public MyBall(int gameCnt){
		init(gameCnt);
	}
	
	//메소드
	private void init(int gameCnt){
		myArr = new int[gameCnt];
		scan = new Scanner(System.in);
	}
	int getMyNum(int idx){
		return myArr[idx];
	}
	
	void setNumbers() {
		int myArr[] = new int[gameCnt];
		int max = 9;
		int min = 1;
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<gameCnt; i++) {
			System.out.printf("값%d: ", i+1);
			myArr[i] = scan.nextInt();
			if(max <myArr[i] || min > myArr[i]) {
				System.out.println("범위 밖의 숫자입니다.");
				i--;
				continue;
			}
			for(int z=0; z<i; z++) {
				if(myArr[z]==myArr[i]) {
					System.out.println("중복된 숫자입니다.");
					i--;
					break;
				}
			}
		}
		
	}
}
