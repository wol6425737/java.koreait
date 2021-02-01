package com.kita.first.level4;

public class Child extends Parent{
	
	Parent ChildField = new Parent() {
		@Override
		void parentMethod() {
			System.out.println("재정의합니다.");
		}
	};
	
	void childMethod(){
		Parent childVar = new Parent() {
			@Override 
			void parentMethod() {
				System.out.println("아 이게뭐냐고.");
			}
		};
		childVar.parentMethod();
	};
	
	void childMethod2(Parent parent) {
		
	}
	

	

}
