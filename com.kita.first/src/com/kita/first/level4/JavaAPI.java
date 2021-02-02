package com.kita.first.level4;

public class JavaAPI {//docs.oracle.com/javase/8/docs/api
	public static void main(String[] args) {
//		Parent p = new Parent();
//		
//		String str = "안녕";
//		StringBuffer sb = new StringBuffer("안녕");
//		
//		boolean result = (sb.equals(str)); //equals는 String만 비교할 수 있음 StringBuffer은 False뜸
//		boolean result2 = (str.contentEquals(sb));//contentEquals는 다 됨.
//		//boolean result3 = (sb.contentEquals(str));
//		boolean result4 = (str.contentEquals("안녕"));
//
//		System.out.println(result);
//		System.out.println(result2);
//		System.out.println(result4);
//		
//		
//		System.out.println(p.toString()); //주소값 확인
//		
//		str = "124";
//		Integer.parseInt(str);
//		str = "2.3";
//		Double.parseDouble(str);
//		Float.parseFloat(str);
//		
//		Math.random(); // 0<= Math.random(); <1
//		System.out.println((int)Math.random()); // 무조건 0
//		int max = 10;
//		int min = 1;
//		int num = (int)((Math.random())*(max - min +1) + min);
//		System.out.println(num);
//		
//		String.valueOf(num);
		
		char c = new Character('A'); //new 연산자로 할 때 Character, Integer로 만듦
		int num = new Integer("1000");//큰따옴표로 문자열을 보내도 받아준다.
		double num2 = new Double("34.56787");
		int num3 = new Integer("010801");
		System.out.println("num3: "+num3);//맨 앞에 0은 어디갓나?
		
		String ad = "010801 3456789";
		Character c2 = ad.charAt(7);
		System.out.println("c2 : " + c2);
		
		switch(c2) {
		case 1: case 3:
			System.out.println("남자입니다.");
		case 2: case 4:
			System.out.println("여자입니다.");
		}
		
		
		System.out.println(c);
		System.out.println(num);
		System.out.println(num2);
		
		String str = "오늘은 날씨가 좋다.";
		Character v1 = str.charAt(4); //문자 하나 받아오는 메소드
		System.out.println("v1: " + v1);
		
		int idx = str.indexOf("날씨가");
		System.out.println("idx = " + idx);
		
		int len = str.length();
		System.out.println("len : " + len);
		
		String str2 = str.replace("날씨가","기분이");
		System.out.println("str2 : "+str2);
		
		String str3 = str.substring(4);//4번째부터 끝까지~
		System.out.println("str3: " + str3);
		
		String str4 = str.substring(4, 7); // 마지막 숫자번째 글자는 나오지 않는다.
		System.out.println("str4 :" + str4);
		
		String str5 = "Hello~ I'm fine thank you and you?";
		String str6 = str5.toLowerCase();
		String str7 = str5.toUpperCase();
		
		System.out.println("str6: " + str6);
		System.out.println("str7: " + str7);
		
		String str8 = "    안녕         ";
		String str9 = str8.trim();
		System.out.println("str9: " + str9);
		
		Math.random();
		double n1 = Math.abs(-3.4); //절댓값
		System.out.println("n1: " + n1);
		
		int n2 = (int)Math.ceil(5.6);//Math.ceil : 올림	
		//double n2 = Math.ceil(5.6);//기본적으로 double로 받아줌 근데 꼴보기싫어서 int로 강제변환 함 위에서	
		System.out.println("n2: " + n2);
		double n3 = Math.ceil(-4.8);
		System.out.println("n3: " + n3);
		
		double n4 = Math.floor(5.7); //내림
		System.out.println("n4: " + n4);
		
		double n5 = Math.round(4.5); // 반올림
		System.out.println("n5: " + n5);
		
		
				
		
		
		
		
		
		
		
	}

}
