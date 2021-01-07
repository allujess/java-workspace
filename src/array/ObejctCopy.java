package array;

public class ObejctCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		Book[] copyLibrary = new Book[5];
		

		// 책을 5개를 다 넣을라면 직접 넣어줘야한다.
		library[0] = new Book("태백산맥1", "조경례");
		library[1] = new Book("태백산맥2", "조경례");
		library[2] = new Book("태백산맥3", "조경례");
		library[3] = new Book("태백산맥4", "조경례");
		library[4] = new Book("태백산맥5", "조경례");
		
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
//		for(int i = 0; i <library.length; i++) {
//			//System.out.println(library[i]);
//			library[i].showBookInfo();
//			
//		}
		
		//향상된 포문 : length만큼 돌겠다 (간단하게사용)
		//1.어떤 객체로 꺼내올지 type선언과 변수선언  : coplLibrary의 전체를 돌구 
		//2.book에 넣겠다 
//		for(Book book : copyLibrary) {
//			book.showBookInfo();
//		}
		
		//원본의 책을 바꿈 	
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


