package array;

public class ToDimension {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3},{4,5,6}};
		
//		//전체 어레이 렝스 	
//		System.out.println(arr.length); //2개의 행 	
//		System.out.println(arr[0].length); //첫번째행 	
//		System.out.println(arr[1].length); //두번째행 	
		
		//행의 밖에서 기준으로 열을 안에서 	돌리면됨 ->이중 for문
		for(int i = 0; i<arr.length; i++) {
			
			//조건식 : 각행의 길이만큼
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
