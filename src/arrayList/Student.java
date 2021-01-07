package arrayList;

import java.util.ArrayList;

public class Student {

	int studentID;
	String studentName;
	
	ArrayList<Subject> subjectList; //배열을 유지 
	
	//생성해야함p
	public Student(int studentID, String studentName) {
		
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		
	}
	
	//과목을 수강할때마다 추가하는 메서드 	과목의이름, 학생의 점수 	
	public void addSubject(String name , int score) {
		
		//서브젝트 생성자 가져옴 	
		Subject subject = new Subject(name, score);
		
		subjectList.add(subject);
		
	}
	
	//정보출력
	public void showStudentInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "학생의 " + subject.getName()+ " 과목의 성적은 " + subject.getScore()+ "입니다.");
			
		}
			System.out.println(studentName + "학생의 총점은 " + total + "입니다.");
	}
	
	
}
