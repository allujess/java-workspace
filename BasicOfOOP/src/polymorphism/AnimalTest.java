package polymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal{
	

	public void move() {
		
		System.out.println("사람이 두발로 걷습니다..");
	}
	
	
}

class Tiger extends Animal{
	

	public void move() {
		
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal{
	

	public void move() {
		
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펼칩니다.");
	}
	
}

public class AnimalTest {

	public static void main(String[] args) {

		//형변환업캐스팅 	
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		//arrayList로 뽑아보기 
		//원하는 타입을 넣어줌
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move(); //각 인스턴스의 move를 호출 virtual function 	
		}
		 
	}
	
	
	
	//move라는 animal를 하나 만들음 
	public void moveAnimal(Animal animal) {
		
		//한 줄의 코드의 구현내용이 다 다름 
		animal.move(); //가상메서드에 매핑되늰 함수가 호출 	
	}

}
