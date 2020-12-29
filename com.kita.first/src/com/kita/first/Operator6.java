package com.kita.first;

public class Operator6 {
	public static void main(String[] arg) {
		//비교 : ==, !=, >, <, >=, <=
		//논리 : !, &, |, &&, ||
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		boolean result1 = (n1 == n2 && n1 != n3 && n2 <= n3);//&& : and
		System.out.println(result1);
		System.out.println(!result1); //! 참 거짓 바꾸기
		System.out.println(!!result1);
		boolean result2 = (n1 == n2 || n1 == n3 || n2 == n3);//|| : or
		System.out.println(result2);
		System.out.println(!result2);
	
		
		
		
	}

}
