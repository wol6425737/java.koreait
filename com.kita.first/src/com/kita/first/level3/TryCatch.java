package com.kita.first.level3;

public class TryCatch {
	public static void main(String[] args) {
//		String str = "123.45";
//		int num1;
//		double num2;
//		try {
//			num1=Integer.parseInt(str);
//		}catch(Exception e) {
//			e.printStackTrace();
//			num2 = Double.parseDouble(str);
//		}
		//int num1 = Integer.parseInt(str);//문자열 인트로 변환
		//double num2 = Double.parseDouble(str);


		double n1 =3.4;
		int n2 = (int)n1;

		System.out.println(1 + 2 + 3);
		System.out.println(1 + 2 + "3");
		
		Animal ani = new Animal();
		Cat cat = new Cat();
		ani = cat;
		
		try {
			//Cat dog = (Cat)ani;
			
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("문제 발생");
		}finally { //있어도 되고 없어도 되고
			System.out.println("형 변환 시도 종료");
		}
		
		
	}

}
