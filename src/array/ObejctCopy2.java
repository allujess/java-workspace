package array;

public class ObejctCopy2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		Book[] copyLibrary = new Book[5];
		

		// 책을 5개를 다 넣을라면 직접 넣어줘야한다.
		library[0] = new Book("태백산맥1", "조경례");
		library[1] = new Book("태백산맥2", "조경례");
		library[2] = new Book("태백산맥3", "조경례");
		library[3] = new Book("태백산맥4", "조경례");
		library[4] = new Book("태백산맥5", "조경례");
		
		//
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		//0번부터 도는거여서 index필요 	
		for(int i = 0; i  < library.length; i++) {
			
			//원본라이브러리의 get을 copyLibrary의 set으로 넣어주는거 
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
			
		}
		
		//깊은 복사는 원본에 값을 바꾸어도 카피본에 값이 바뀌지 않는다 
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for( Book book : library) {
			book.showBookInfo();
		}
		System.out.println("=======");
		
		for( Book book :copyLibrary) {
			book.showBookInfo();
		}
	}
	
	

}


