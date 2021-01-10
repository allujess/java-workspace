package inheritance;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//default  일반등급은 실버 	
	public Customer() {
		customerGrade = "SILVER"; //실버는 1프로 적립 10000원가면 100원적립 	
		bonusRatio = 0.01;
		
	}
	
	//가격계산하는 함수 
	public int calPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		
		
		return price; //보너스로 적립하고 integer로 반환 	
	}
	
	//값들 	
	public String showCustomerInfo() {
		
		
		return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스포인트는 " + bonusPoint + "입니다.";
		
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


