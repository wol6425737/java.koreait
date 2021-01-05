package com.kita.first.practice;

public class Practice02 {
	public static void main(String[] args) {
		/*
		 * name
		 * age
		 * vision
		 * bloodType
		 * 제 이름은 ooo이고 나이는 oo 살입니다.
		 * 시력은 o.o이고 혈액형은 o형입니다.
		 **/
		String name = "김수한";
		int age = 26;
		float vision = 1.0f;
		String bloodType = "AB";
		
		System.out.println("제 이름은 " +name+"이고 나이는 " +age+"살입니다.");
		System.out.println("시력은 "+vision+"이고 혈액형은 "+bloodType+"형입니다.");
		System.out.println();
		System.out.print("제 이름은 " +name+"이고 나이는 " +age+"살입니다.\n시력은 "+vision+"이고 혈액형은 "+bloodType+"형입니다.");
		System.out.println();
		System.out.println();
		System.out.printf("제 이름은 %s이고 나이는 %d입니다.\n", name, age);
		System.out.printf("시력은 %.1f이고 혈액형은 %s입니다.", vision, bloodType);
		
		
	}

}
