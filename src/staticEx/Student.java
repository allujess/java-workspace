package staticEx;

//객체의 청사진이다 

//public은 1나여야만 함 다른 class도 들어올 수 있음 
public class Student {

	//학생이 생성될때마다 ID를 자동으로 부여해주고싶음
	//기준으로되는 값을 증가할 수 있게 기준이 되는값은 모든 인스턴스가 하나의 메모리이게 
	//static 으로 	
	private static int serialNum = 1000; //얘또한외부에서 접근못하게 private으로 접근제어자 설정 	
	private int studentID;
	public String studentName; //char[]도 가능하지만 머리깨짐 조심 	
	public String address;
	
	//default생성자 구현 
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
		
		
		
	}
	//생성자를 만듬 
	//매개변수를 초기화해줌 
	public Student(int id, String name) {
		studentID = id; 
		studentName = name;
		address = "주소없음";
		studentID = serialNum; //증가되는 스태틱값이 ID로 들어감 	
		
	}
	
	//2.학생의 정보를 보여줍니다 ->메서드
	//void는 반환하는 값의 데이터타입 -> 반환하는게 없을때 쓰는거 
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	//일반메서드 
	public int getStudentID() {
		
		serialNum++; //문제가 되지않음 그 이유는 static변수는 그 이전에 생성이됨 처음에 프로그램에 메모리에 로드될때 내려갈떄 사라짐
		//stativ은 큰 메모리를 사용하면안됨 , 메모리를 차지하므로 
		
		return studentID;
		
	}
	
	//get/set을 사용해서 static메서드를 생성
	public static int getSerialNum() {
		
		int i = 0; //함수 안에 선언된 변수 , 지역변수는 함수가 시작되면 stack메모리에 생끼고 없어짐 
		
		//static안에서 인스턴스변수를 사용할 수 없음 ->coz 스태틱은 인스턴스와 상관없이 호출되서 / 안에서 사용할 수 없음  
	//	studentName = "Lee"; //static메서드안에서 인스턴스변수를 사용할 수 없음 

		
		
		return serialNum;//static변수 
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
	
	
	


}
