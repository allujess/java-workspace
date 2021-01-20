package inheritance;

//굳이 따로 구현하는게아니라 Customer를 상속을 받자 
public class VIPCustomer extends Customer{
	
	
	private int agentID;	//고객사 
	double salesRatio;		//할인비율 

	//매개변수를 받는 생성자를 만들고 
	public VIPCustomer(int customerID, String customerName) {
		//매개변수가 있는 생성자일 경우에는 super를 명시적으로 불러오는 상황
		super(customerID, customerName);  
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	//	System.out.println("VIP (int, String)...blahblah");

	}

	//상위클래스에 있던 메소드를 여기 (하위클래스에서) 재정의해서 다시씀 	
	//오버라이딩 재정의함 
	@Override
	public int calcPrice(int price) { //선언부가 동일해야함 자료형조차 다르면 오류남 

					
		bonusPoint += price * bonusRatio;
		
			//가격은 할인
		return price - (int)(price * salesRatio); 
		
		
	}
	
	
	

	
	

}







