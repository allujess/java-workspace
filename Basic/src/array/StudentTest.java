package array;

public class StudentTest {

	public static void main(String[] args) {

		//Student클래스에 ArrayList멤버변수를 하나 가지고 각 학생이
		//수강하는 과목을 관리하도록 합니다.
		
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100); //과목추가하는 메서드 	
		studentLee.addSubject("수학", 90);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 90);
		studentKim.addSubject("영어", 80);
		
		
		//모든 정보를 출력하는 메소드 	
		studentLee.showStudentInfo();
		System.out.println("====================");
		studentKim.showStudentInfo();
	}

}
