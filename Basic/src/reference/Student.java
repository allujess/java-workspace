package reference;

public class Student {
	
	int studentID;
	String studentName; 
	
	Subject korea;
	Subject math;
	
	//참조자료형 타입으로 변수를 선언하고 
	//생성을 해서 사용해야함 
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		
		
		korea = new Subject();
		math = new Subject();
		
	}
	
	public void setKoreaSubject(String name, int score) {
		
		korea.subjectName = name;
		korea.score = score;
		
	}
	
	public void setMathSubject (String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		
		int total = korea.score + math.score;
		System.out.println( studentName + "학생의 점수는 " + total + "입니다.");
	}
	
	
	

}
