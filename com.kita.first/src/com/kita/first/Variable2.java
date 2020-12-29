package com.kita.first;

public class Variable2 {
	public static void main(String[] args) {
		int num = 5_000_000; //언더 바 쓰면 결과값에는 안보임. 우리 눈에 보기 좋게 쓸 때 쓰면 됨
		System.out.println(num);
		
		int n1 = 10;
		long n2 = 20;
		
		long result1 = n1 + n2;
		System.out.println(result1);
		
		int result2 = (int)(n1 + n2); //n1은 int고 n2는 long인데 둘의 합을 int로 할 수 없음 어쩔 수 없이 (int)로 강제변환시키면 가능은함
		System.out.println(result2);
		
	}
}
