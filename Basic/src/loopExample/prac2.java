package loopExample;

import java.util.Scanner;

public class prac2 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		String msg = "3의 배수가 아닙니다.";
		
		if(num%3 == 0) {
			msg = "3의 배수입니다.";
			
		}
		
		System.out.println("입력하신 정수는 " + msg);
		
		
	}

}
