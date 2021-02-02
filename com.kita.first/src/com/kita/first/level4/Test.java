package com.kita.first.level4;

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent() {
			String childField = "자식 필드";
			
			void childMethod() {
				System.out.println("자식 메소드입니다.");
			}
			@Override
			void parentMethod() {
			childMethod();
			System.out.println(childField + "자식 객체입니다.");
			};
		};
		//익명개체에서 필드 메소드 만들어서 바로 사용가능하다.
		
		
		p.parentMethod();//새 클래스 만들 필요 없이 한번만 override 하고 싶을 때 익명객체, p라는 인스턴스 안에 위와 같이 함
		
		Child child = new Child();
		child.childMethod();
		child.childMethod2(new Parent() {
			@Override
			void parentMethod() {};
		});
		
		//익명 개체는 객체 이름이 들어갈 수 있는 모든 곳에 들어갈 수 있다.
		
		
		

		
			
		ThrowsException2 te2 = new ThrowsException2();

		try{
			te2.method1();
		}catch(Exception e) {
			System.out.println("숫자 입력해라");
		}
		
		
		
		
		
//		//AkmuAlbum album = new AkmuAlbum();
//		AkmuAlbum album1 = new MusicPlayer(); //악뮤앨범 인터페이스를 계승받은 뮤직플레이어는 인스턴스 만들 수 있음
//		IUAlbum album2 = new MusicPlayer();
//		
//		album1.playAkmuAlbum();
//		album1.stopAkmuAlbum();
//		//album1.playIUAlbum();
//		//album1.stopIUAlbum();
//		
//		//album2.playAkmuAlbum();
//		//album2.stopAkmuAlbum();
//		album2.playIUAlbum();
//		album2.stopIUAlbum();
//		//album2.playMichaelJacksonAlbum();
//		
//		MusicPlayer myMp3 = (MusicPlayer)album1;//album1은 뮤직플레이어보다 더 큰 악뮤앨범 인터페이스를 받았으나 뮤직플레이어로 강제 형변환
//		myMp3.playMichaelJacksonAlbum();

		
		
		
		
	}

}
