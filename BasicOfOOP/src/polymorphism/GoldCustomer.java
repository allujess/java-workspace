package polymorphism;


//새로운 클래스를 추가하는거에있어어 들어가는 비용이 적음 	
public class GoldCustomer extends Customer{
	
	//할인을 좀 해줄꺼임 
	double salesRatio;
	
	//생성자 추가 	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
		
	}
	
	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		
		return price - (int)(price * salesRatio);
		
	}
	
	

}
