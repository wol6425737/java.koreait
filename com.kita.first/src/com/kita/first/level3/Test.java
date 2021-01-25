package com.kita.first.level3;

public class Test {
	public static void main(String[] args) {
		ProGamer p1 = new ProGamer();
		Game game = new Game();
		p1.playGame(game);
		
		StardewValley sDew = new StardewValley();
		p1.playGame(sDew);
		
		Lol lol = new Lol();
		p1.playGame(lol);
		
		
//		Animal animal = new Animal();
//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		animal.crying();
////		animal = new Animal();
//		animal = cat;
//		animal.crying();
//		animal = dog;
//		animal.crying();
//		boolean result1 = animal instanceof Dog;
//		System.out.println(result1);
//		//animal.barking();  animal클래스에 없어서;; 안됨
//		Dog dog1 = (Dog)animal; //animal을 Dog객체로 강제 형변환
//		dog1.barking();
//		System.out.println(animal);
//		System.out.println(cat);
//		System.out.println(animal == cat);
		Student minsu = new Student();
		
		for(int i=1; i<=10; i++) {
			int result = minsu.readBooks();
			switch(result) {
			case 1://minsu가 book1을 다 읽었을 경우
				minsu.book1 = new ComicBook(8);
				System.out.println("새 만화책을 가져왔다.");
				break;
			case 2:
				minsu.book2 = new MajorTextBook(7);
				System.out.println("새 전공서적을 가져왔다.");
				break;
			case 3:
				minsu.book3 = new Book(4);
				System.out.println("새 책을 가져왔다.");
				break;
			}
			System.out.println("--------------");
		}
	}

}
