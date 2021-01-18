package loopExample;

import java.util.Scanner;

public class prac1 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if(num > 10) {
			System.out.println("10보다 큽니다.");
		}else {
			System.out.println("10보다 작습니다.");
		}
	}

}
