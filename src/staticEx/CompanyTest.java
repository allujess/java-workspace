package staticEx;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		
		Company company = Company.getInstance();
		
		Company company1 = Company.getInstance();
		
		System.out.println(company);
		System.out.println(company1);
		
		//이게 싱글톤 패턴 유일한 객체 ㅇㅅㅇ?
		
		//calendar도 싱글톤패턴 객체들 쓸일이있음 	
		Calendar calendar = Calendar.getInstance();
		
	}

}
	