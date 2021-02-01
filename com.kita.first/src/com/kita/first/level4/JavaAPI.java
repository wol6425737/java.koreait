package com.kita.first.level4;

public class JavaAPI {
	public static void main(String[] args) {
		Parent p = new Parent();
		
		String str = "안녕";
		StringBuffer sb = new StringBuffer("안녕");
		
		boolean result = (sb.equals(str)); //equals는 String만 비교할 수 있음 StringBuffer은 False뜸
		boolean result2 = (str.contentEquals(sb));//contentEquals는 다 됨.
		//boolean result3 = (sb.contentEquals(str));
		boolean result4 = (str.contentEquals("안녕"));

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result4);
		
		
		System.out.println(p.toString()); //주소값 확인
		
		str = "124";
		Integer.parseInt(str);
		str = "2.3";
		Double.parseDouble(str);
		Float.parseFloat(str);
		
		Math.random(); // 0<= Math.random(); <1
		System.out.println((int)Math.random()); // 무조건 0
		int max = 10;
		int min = 1;
		int num = (int)((Math.random())*(max - min +1) + min);
		System.out.println(num);
		
		String.valueOf(num);
		

		
		
		
		
		
		
		
		
	}

}
