package com.kita.first.level3.baseball;

public class Game {
//실제 실행하는 클래스


	

	
	
	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myBall = new MyBall(gameCnt);
		
		
		System.out.println("야구게임 시작!");
		
	
		do {
			myBall.setNumbers();
			
		}while(Checker.check(gameCnt, ball, myBall));
		
		System.out.println("야구게임 종료!");
	}
	
}
