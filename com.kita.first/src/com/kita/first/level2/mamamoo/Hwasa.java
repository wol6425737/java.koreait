package com.kita.first.level2.mamamoo;

import com.kita.first.level2.hyori.LeeHyoRi;//자동으로 main method 복붙하면 import 해준다.

public class Hwasa extends LeeHyoRi  {
	public Hwasa(){
		//super(12); //생성자가 private이라 안됨.
		super("인스타");//생성자가 protected라 상속해서 들고 올 수 있음
					  //만약에 디폴트라면 상속해도 다른 패키지라 안됨.
		this.music = "";
		this.sns = "";
		//this. star = 12;
		//super.sns = "";
		drinkTea(); //protected 메소드라 데리고 올 수 있음
	}
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸";
		//hr.sns = "인스타";//디폴트도 다른 패키지에서는 안된다.
		//hr.star = 10000000;
		
		//LeeHyoRi hr2 = new LeeHyoRi("인스타"); //디폴트도 다른 패키지에서 안된다.
		//LeeHyoRi hr3 = new LeeHyoRi(10000000);
		
		hr.sing();
		//hr.drinkTea();//다른 패키지에선 디폴트 못 들고 옴
		//hr.dance();//private이라 못 들고 옴
		//hr.drinkTea(); // protected이지만 메인 메소드에 새로운 LeeHyoRi hr 인스턴스를 만들어서 메소드를 데리고 올 수 없음
	}
	

		
	

}
