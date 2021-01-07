package array;

public class BookArrayTest {

	public static void main(String[] args) {

		//배열이 생긴거지 책이 5권이 생긴게 아님 
		Book[] library  = new Book[5];
		
		//책을 5개를 다 넣을라면 직접 넣어줘야한다.
		library[0] = new Book("태백산맥1", "조경례");
		library[1] = new Book("태백산맥2", "조경례");
		library[2] = new Book("태백산맥3", "조경례");
		library[3] = new Book("태백산맥4", "조경례");
		library[4] = new Book("태백산맥5", "조경례");
		
		
		for(int i = 0; i < library.length; i++) {
			
			//null만 출력됨 , 주소값이 들어가는 자리
			System.out.println(library[i]); 
			
			//만든 메소드를 더해서 정보를 출력해줌 
			library[i].showBookInfo(); 
			
		}
		
	}

}
