package com.kita.first.practice;

public class Practice03 {
	public static void main(String[] args) {
		//n1 (+=) n2
		
		int n1 = 10;
		int n2 = 3;
		
		n1 += n2;
		int result1 = n1;
		n1 = 10;
		n1 -= n2;
		int result2 = n1;
		n1 = 10;
		n1 *= n2;
		int result3 = n1;
		n1 = 10;
		n1 /= n2;
		double result4 = n1;
		n1 = 10;
		n1 %= n2;
		int result5 = n1;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}

}
