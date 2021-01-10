package inheritance;


//더 확장된 클래스니깐 베이스 클래스를 두고 상속을 받으면 됨 
public class VIPCustomer extends Customer{

	//같은거닌ㄱ깐 빼는겨 	
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	private int agentID; //담당상담원
	double salesRatio; //할인ㅇㄹ 	
	
	public VIPCustomer() {
		
		//private 말고 protected로 함 private은 노접근 
		customerGrade = "VIP"; //private이여서 외부클래스는 바로접근이 안됨 상속관계도 사용못함 !!	
		bonusRatio = 0.05;
		salesRatio = 0.01;
		
	}
	
	
}
