package ifExample;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int score = scanner.nextInt();

		// 문자열로 출력
		char grade;

		if (score >= 90) {
			grade = 'A';
			
		} else if (score >= 80) {
			grade = 'B';
			
		} else if (score >= 70) {
			grade = 'C';
			
		} else if (score >= 60) {
			grade = 'D';
			
		} else {
			grade = 'F';
			
		}
		System.out.println(score  + "점을 맞은 학생의 등급은 " + grade + "입니다.");
	}

}
