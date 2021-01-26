package array;

import java.util.ArrayList;

public class Student {

	
	int studentID;
	String studentName;

	// 학생들이 여러과목을 들을때 다양하니깐 과목을 arrayList를 통해
	// subject요소를 넣어서 과목을 관리함
	ArrayList<Subject> subjectList;

	//subjectList는 생성자에서 생성함
	public Student(int studentID, String studentName) {
		
		this.studentID = studentID;
		this.studentName = studentName;
		
		// arrayList생성쓰
		//배열로 유지 	
		subjectList = new ArrayList<Subject>();

	}

	// add해줘야함
	// 메서드를 통해 과목을 수강할때마다 추가
	public void addSubject(String name, int score) {
		
		//객체는 생성을해서 넣어줘야함 
		Subject subject = new Subject(name, score);
		subjectList.add(subject);// 한 과목씩 name, score가 추가되는거임

	}

	//정보를 출력 	
	public void showStudentInfo() {
		
		int total = 0;

	
		for (Subject subject : subjectList) {

			total += subject.getScore(); //총점 구할려고 score를 누적하기 
			System.out.println(studentName + "학생의 " + subject.getName() + "과목의 성적은 " + subject.getScore() + "점 입니다.");

		}

		//for밖에서 	
		System.out.println(studentName + "의 총점은 " + total + "점 입니다.");

	}
	

}
