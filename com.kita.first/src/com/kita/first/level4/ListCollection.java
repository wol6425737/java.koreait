package com.kita.first.level4;

import java.util.ArrayList;
import java.util.LinkedList;
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
		
		//리스트에 삽입과 삭제가 빈번할 경우에는 LinkedList가 더 빠르다.자료를 뽑아올 때에는 느리다.
		//List<> list = new LinkedList<>();
		
		List<Cd> shelf = new LinkedList<Cd>();
		Cd cd1 = new Cd("여름","아이유",2019);
		Cd cd2 = new Cd("항해","악동뮤지션",2020);
		
		shelf.add(cd1);
		shelf.add(cd2);
		shelf.add(cd2); //중복으로 넣을 수 있음, LinkedList는 객체를 넣는게 아니라 객체 주소를 넣는 것
		
		
		
		
		

		
		
	}

}
