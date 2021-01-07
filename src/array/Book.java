package array;

public class Book {

	
	private String title;
	private String author;
	
	//디폴트 생성자와 	
	public Book() {
		
	}
	
	//매개변수를 담은 또 다른 생성자 
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(title + ", " + author);
	}
	
	
}
