package array;

public class ObjectCopy2 {

	public static void main(String[] args) {

		// [5]배열이 생긴거임
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		

		// 요소의 assign을 해줘야한다 값을 넣어줘야함
		library[0] = new Book("태백산맥1", "조정례");
		library[1] = new Book("태백산맥2", "조정례");
		library[2] = new Book("태백산맥3", "조정례");
		library[3] = new Book("태백산맥4", "조정례");
		library[4] = new Book("태백산맥5", "조정례");

		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		
		
		
		//원본의 
		library[0].setTitle("나목");
		library[0].setAuthor("박완선");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		System.out.println("================");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		
	}

}






