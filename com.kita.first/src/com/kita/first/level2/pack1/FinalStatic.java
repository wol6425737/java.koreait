package com.kita.first.level2.pack1;

public final class FinalStatic {
	//class에 final 붙이면 자식만들 수 없음. 상속안됨.
	final int N1;
	static final int N2 = 4;
	static int n3 = 1;
	
	FinalStatic(int n1, int n2) {
		this.N1 = n1;
		printNum(n1);
		n3 = n2;
	}
	
	static /*final*/ void printNum(int input) {
		System.out.println(input);
		System.out.println(n3);
//		call();//static에 올려놓아서 void call에 static이 안붙으면 인식을 못함
		//새로운  인스턴스가 나와서 값이 입력돼야 빨간줄 사라짐.
	}
	//메소드에 final 붙이면 override불가능
	
	void call() {
		System.out.println("안녕");
	}

}
