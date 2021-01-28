package com.kita.first.level3.vendingmachine;


public class Test {
	public static void main(String[] args) {
//		자판기게임
//		메뉴: 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
//		가격: 900, 700, 400, 500, 600, 1000
//
//		--메뉴--
//		1. 콜라 900원
//		2. 사이다 700원
//		.
//		.
//		.
//		6. 웰치스 1000원

//		메뉴를 입력하세요(0 입력 시 종료): 1
//		콜라 900원
//		메뉴를 입력하세요(0 입력 시 종료): 3
//		캔커피 400원
//		.
//		.
//		.
//		메뉴를 입력하세요(0 입력 시 종료): 0
//		합계: 3700원
		int len = 6;
		Menu menu = new Menu(len);
		PrintV print = new PrintV();
		
		menu.inputArrayItems();
		menu.inputArrayPrices();


		
		System.out.println("--메뉴--");
		for(int i=1; i<=len; i++) {
			print.printMenu(menu, i);
			
		}
		//메뉴, 가격 배열에 값 입력
		Game game = new Game();
		int myNum;
		
		//0입력 시까지 반복되는 반복문 기능
		while(true) {
			myNum=game.inputNum();
			
			//입력 받은 번호 분기 가르기 기능
			if(myNum<0 || myNum>len) {
				System.out.println("범위 내의 숫자를 입력하세요.");
				continue;
			} else if(myNum == 0) {
				break;
			}
			game.setCount();
			game.sumMenuPrice(menu, myNum);
			print.printMenu(menu, myNum);

			

		}
		print.printTotalPrice(game);

		









	}
}
