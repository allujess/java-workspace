package staticEx;

public class StudentIDTest {

	public static void main(String[] args) {

		//생성자가 호출될때마다 ++이 됨 1001 1002 
		//인스턴스마다 따로잡히면 동일하지않을거임 그치만 동일해서 
		//변수들이 같은 메모리를 바라보고있음 	
		Student studentLee = new Student("Lee");
		//static변수는 객체의 생성과 상관없음. 클래스 이름으로 .해서 접근함 
		System.out.println(Student.getSerialNum()); 
		
		Student studentKim = new Student("Kim");
		System.out.println(Student.getSerialNum());
		
//		System.out.println(Student.getStudentID());
//		System.out.println(Student.getStudentID());
//		
		
	}

}
