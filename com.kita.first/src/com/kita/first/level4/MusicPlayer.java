package com.kita.first.level4;

public class MusicPlayer implements AkmuAlbum, IUAlbum {
	int num3 = 34;
	
	@Override
	public void playAkmuAlbum()/*public 반드시 붙여줘야함. 부모인터페이스에 public이 자동으로 붙어있어서*/ {
		System.out.println("항해 앨범을 재생합니다.");
	}
	@Override
	public void stopAkmuAlbum() {
		System.out.println("항해 앨범을 재생합니다.");
		
	}
	@Override
	public void playIUAlbum(){
		System.out.println("셀레브리티 앨범을 재생합니다.");
	}
	@Override
	public void stopIUAlbum(){
		System.out.println("셀레브리티 앨범을 재생합니다.");
	}
	
	public void playMichaelJacksonAlbum() {
		System.out.println("beat it! 앨범을 재생합니다.");
	}


}
