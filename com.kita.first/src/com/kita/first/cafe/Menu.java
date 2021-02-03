package com.kita.first.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> arr = new ArrayList<MenuItem>();
	
	public Menu() {
		arr.add(new MenuItem("아메리카노", 2000));
		arr.add(new MenuItem("카페라떼",2300));
		arr.add(new MenuItem("카페모카", 2500));
		arr.add(new MenuItem("카라멜마키아또",2600));
		
	}
	public void menuSetter(MenuItem mi) {//새 메뉴를 추가하고 싶을 때
		arr.add(mi);
		
		
	}
	
	public String showMenus() {
		System.out.println("  Menu  ");
		for(int i=0; i<arr.size(); i++) {
			MenuItem m = arr.get(i);
			System.out.printf("%d. %s\t\t%,d원\n",i+1,m.getName(),m.getPrice());
		}
		return ""; //String 타입으로 메소드를 만들어 놓고 리턴을 ""로 하면 void보다 더 빠르다. 걍 꼼수
		
	}
	
	public MenuItem choose(int idx) {
		return arr.get(idx);
		
	}
	

}
