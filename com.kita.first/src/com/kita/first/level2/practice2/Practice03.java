package com.kita.first.level2.practice2;

public class Practice03 {
	private String name;
	private int age;
	
	public Practice03(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		Practice03 myP = new Practice03("김땡땡", 20);
		myP.setName("김냥냥");
		myP.setAge(20);
		String Name1 = myP.getName();
		int Age1 = myP.getAge();
		
		System.out.printf("이름 : %s, 나이 : %d", Name1, Age1);
		
		
		//이름, 나이 출력 printf사용
	}

	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
	


}
