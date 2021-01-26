package array;

public class CharArrayList {

	public static void main(String[] args) {

		//문자 배열을 생성하고 출력해보기 
		
		//26개라는 걸을 명시 ㅋ 
		char[] alphabets  = new char[26];
		
		
		//Aㅜ부터 넣기 	
		char ch = 'A';
		
		//i를 alphabets.length보다 작은동안 i++한당 
		for(int i = 0; i < alphabets.length; i++) {
			//문자도 정수로 된다. 다음값이므로 ++
			//65 66 67..이렇게 증가하게 	
			alphabets[i] = ch++;
			
		}
		
		for(int i = 0; i < alphabets.length; i++) {
			//i 번을 출력하면서 + 형변환된 숫자도 알 수 가 잇다,
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}
		
	}

}
