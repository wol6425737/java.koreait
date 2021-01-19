package com.kita.first.level2.pack1;

public class Test {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 5;
		int n3 = 7;
		FinalStatic fs1 = new FinalStatic(n1,n2);
		FinalStatic fs2 = new FinalStatic(n2,n3);
		FinalStatic fs3 = new FinalStatic(n3,n1);
		
		System.out.println(fs1.N1);
		System.out.println(fs2.N1);
		System.out.println(fs3.N1);
		//final int N1;으로 해서 상수로 선언했으나 다 결과값이 다르게 나옴
		System.out.println(fs1.N2);
		System.out.println(fs2.N2);
		System.out.println(fs3.N2);
		//static final int N2로 해야 상수가 됨.
		
		Singleton singleton = Singleton.getInstance();
		
		FinalStatic.printNum(1);

	}

}
