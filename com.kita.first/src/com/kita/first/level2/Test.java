package com.kita.first.level2;

import com.kita.first.level2.hyori.*;
import com.kita.first.level2.mamamoo.*;

public class Test {
	public static void main(String[] args) {
//		com.kita.first.level2.pack1.Class1 c1 = new com.kita.first.level2.pack1.Class1();
//		com.kita.first.level2.pack2.Class1 c2 = new com.kita.first.level2.pack2.Class1();
		Hwasa hs = new Hwasa();
		LeeHyoRi hr = new LeeHyoRi();
		
		Car car1 = new Car(50);
		car1.setColor("검은색");
		
		int car1Speed = car1.getSpeed();
		String car1Color = car1.getColor();
		System.out.println(car1Speed);
		System.out.println(car1Color);
		
		car1.setColor("파란색");
		System.out.println(car1Color);//파란색으로 setColor해도 getColor를 받은적이 없어서 바뀌지 않음
		
		IMac myIMac = new IMac(500,"스페이스 그레이");
		
		myIMac.setMemory(800);
		myIMac.setMemory(600);
		
		int myMemory = myIMac.getMemory();
		System.out.println(myMemory);



		
		
		

//		System.out.println(car1.speed);
		
	}

}
