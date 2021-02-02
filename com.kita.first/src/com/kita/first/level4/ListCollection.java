package com.kita.first.level4;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();//ctrl shift O -> java.util.list
		//List에 <> genetic 붙여서 리스트에 String만 넣겠다고 선언, String말고도 객체이름까지 모든 것이 다 들어갈 수 있음
		
//		int[] arr = new int[5];
		
		list.add("안녕");
		list.add("하세요");
		list.add(2, "저는");
		list.set(0,"하이");
		list.remove(2);
		String result = list.get(1);
		System.out.println(result);
		
		
		

		
		
	}

}
