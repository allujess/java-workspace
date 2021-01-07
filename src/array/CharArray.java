package array;

public class CharArray {

	//아스키코드 
	public static void main(String[] args) {
		
		//QUIZ. 문자 배열을 생성하고 출력해보세요 
		//대문자를 A-Z까지 배열에 저장하고 이를 다시 출력하는 프로그램을 만들어 보세요 
		
		//A-Z까지의 방 인덱스 개수를 뽑아내는구문
		//A-Z의 스펠링은 다 명시 해줘야하나?
		
		//[26]이 A ~ Z 까지 아스키코드로 나오는 범위를 지정 	
		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i <alpahbets.length; i++) {
			
			//'A'로 들어가 ++될때마다 아스키코드로 증가 	
			//65부터 시작함 66, 67, 68 ....
			alpahbets[i] = ch++;
			
		}
		
		for(int i = 0; i < alpahbets.length; i++) {
			System.out.println(alpahbets[i] + "," + (int)alpahbets[i]);
		}
		
	}

}
