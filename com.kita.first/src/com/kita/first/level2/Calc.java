package com.kita.first.level2;

public class Calc {
	
	//필드(속성)
	
	//생성자
	
	//메소드(행동)
	public static void main(String[] args) {
		Calc myCalc1 = new Calc();

		myCalc1.powerOn();
		
		int num1 = myCalc1.sum(2, 3);
		int num2 = myCalc1.minus(4, 2);
		int num3 = myCalc1.mul(5,3);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(myCalc1.div(3,2));
		
		myCalc1.powerOff();
	}
	public void powerOn(/*매개변수*/){
		System.out.println("전원을 켭니다.");
		
	}
	public int sum(int n1, int n2) {
		int result = n1 + n2;
		
		return result;
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public int minus(int n1, int n2) {
		int result = n1 - n2;
		
		return result;
	}
	public int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public double div(int n1, int n2) {
		 double result = (double)n1 / n2; 
		 return result;
		
	}

}
