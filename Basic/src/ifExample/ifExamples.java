package ifExample;

import java.util.Scanner;

//else는 하나의 조건이 만족을 하면 다음 조건을 보지않음 
public class ifExamples {
	
	public static void main(String[] args) {
		
		//포인트 : 걸린거는 수행이 안됨 
		
		//입력을 도와주는 클래스 	system.in 표준입력용 
		Scanner scanner = new Scanner(System.in);
		
		//콘솔에서 입력받을 수 있게 스캐너 클래스를 사용 	
		int age = scanner.nextInt();
//		int age = 10; 이거는 10라고 정해진 값	
		
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
			
		}else if(age < 14) {
			charge = 1500;
			
		}
		else if(age < 20) {
			charge = 2000;
		}
		else {
			charge = 3000;
			
		}
		
		System.out.println("나이 : " + age);
		System.out.println("요금 : " + charge);
		
		
		
	}

}
