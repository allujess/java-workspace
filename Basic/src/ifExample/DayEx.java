package ifExample;

import java.util.Scanner;

public class DayEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		int day; //변수데이 
		
		switch(month) {
		
		//case가 달라도 같은 로직을 사용하면 연달아 사용할 수 있음 	
		case 1: case 3 : case 5: case 7 : case 8: 
			day =31;
			break;
			
		case 2 : day = 28;
			break;
	
		case 4 : case 6 : case 11: 
			day = 30;
			break;
		
		default : System.out.println("Error");
		day  = 0;
		
		}
		System.out.println(month + "월은 " + day + "일 입니다.");
		
	}

}
