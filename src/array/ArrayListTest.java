package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		//어떤 객체를 쓸것인지 <>안에 쓰기 	
		//어떤 클래스를 쓸 것인지 지정 제너릭타입 
		ArrayList<String> list = new ArrayList<String>();
		
		//메서드들을 보면 어떤 매개변수와 반환값인지 보면됨 
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//size메서드로 꺼냄 elements 개수를 나타냄
		//배열은 길이를 사이즈는 개수만을 나타냄 
		for(int i = 0; i <list.size(); i++) {
			String str  = list.get(i); //하나를 꺼냄 
			System.out.println(str);
		}
		//처음부터 끝까지 순회하는거는 이거 
		for(String s : list) {
			System.out.println(s);
		}
		
	}

}
