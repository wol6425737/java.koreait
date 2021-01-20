package com.kita.first.level2;

public class Car {
	private int speed;
	private String color;
	
	Car(int speed) {
		this.speed = speed;
	}
	
	Car(String color) {
		this.color = color;
	}
	Car(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}
	
	void setSpeed(int speed) {
		this.speed =speed;
	}
	
	int getSpeed() {
		return speed;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	String getColor() {
		return color;
	}

}
