package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		//<>어떤 클래스를 지정해줄 것인가 
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i); //꺼내올때 3번째까지 꺼내와라 
			System.out.println(str);
		}
		
		//처음부터 끝까지 순회 	
		for(String s :list) {
			System.out.println(s);
		}
		
		
	}

}








