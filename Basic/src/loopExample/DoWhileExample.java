package loopExample;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {

		// 문제
		// 입력받는 정수를 모두 더해줍니다.
		// 입력된 정수가 0이면 반복문을 빠져 나옵니다.

		// 0이면 아무것도 안하고 빠져나오고아니면 계속 더해줌

		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		do {
			input = scanner.nextInt();
			sum += input;
			
		}while(input != 0);
		
		System.out.println(sum);
		
	}

}
