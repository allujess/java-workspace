package array;

public class BookArrayTest {

	public static void main(String[] args) {

		//[5]배열이 생긴거임 
		Book[] library = new Book[5];
		
		//요소의 assign을 해줘야한다 값을 넣어줘야함 
		library[0] = new Book("태백산맥1", "조정례");
		library[1] = new Book("태백산맥2", "조정례");
		library[2] = new Book("태백산맥3", "조정례");
		library[3] = new Book("태백산맥4", "조정례");
		library[4] = new Book("태백산맥5", "조정례");
		
		
		for(int i = 0 ; i < library.length; i++) {
			System.out.println(library[i]);
			//앞에만든 메소드를 출력해서 출력하기 
			library[i].showBookInfo(); 
			
		}
		
	}

}
