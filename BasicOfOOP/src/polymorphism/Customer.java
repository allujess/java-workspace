package polymorphism;

public class Customer {
	
	
	protected int customerID;	//고객 아이디 
	protected String customerName; //고객이름 
	protected String customerGrade; //silver 일반등급 
	int bonusPoint;	//보너스포인트 지급
	double bonusRatio; //실버등급은 1프로 적립 만원사면 백원적립 	
	
	//default 생성자 로 초기화 
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		
//	System.out.println("Customer() 생성자 호출");
//	}
	
	//고객의 아이디와 이름을 매개변수로 	받음 	+ 생성자 추가 
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	//	System.out.println("Customer(int,String)생성자호출");
		
	}
	
	
	//가격계산하는 함수 
	//가격을 받으면 지불할 가격을 반환해줄꺼임 	
	public int calcPrice(int price) {
		//보너스 포인트 적립해주고 	
		bonusPoint += price * bonusRatio;
		return price; //얼마를 반환할지 interger로 반환 	
	}
	
	public String showCustomerInfo() {
		
		return customerName +"님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "접입니다.";
		
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
	
	
	
	
	
}
