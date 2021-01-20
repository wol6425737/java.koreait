package com.kita.first.level2.hyori;

public class LeeSangSun extends LeeHyoRi {
	LeeSangSun(){
		super(""); //같은 패키지에서는 디폴트 생성자도 상속으로 들고 올 수 있음
	}
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸";
		hr.sns = "인스타";
		//hr.star = 10000000;
		
		LeeHyoRi hr2 = new LeeHyoRi("인스타"); //디폴트까지는 같은 패키지 안에서 된다.
		//LeeHyoRi hr3 = new LeeHyoRi(10000000);
		
		hr.sing();
		hr.drinkTea();
		//hr.dance(); //private이라 다른 클래스에서 못 씀 
	}

}
