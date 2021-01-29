package com.kita.first.level4;

public interface AkmuAlbum {
	//상수 필드
	String SONG_WRITER = "이찬혁";//Interface에서는 public static final 안 넣어줘도 자동으로 상수취급
	/*public static final*/ int PRICE = 20_000;
	
	
	//추상메소드
	/*public abstract*/ void playAkmuAlbum(); //Interface에선 public abstract 안적어줘도 자동으로 추상 메소드
	
	void stopAkmuAlbum();
	

}
