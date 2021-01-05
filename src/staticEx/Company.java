package staticEx;

public class Company {
	
	//내부적으로 변수를 생성 ->유일한 static
	private static Company instance = new Company();
	
	
	//컴파일러에서 default를 제공해줄 일이 없음 이미 만들어서 	
	private Company() {} //외부에서도 접근 못함 private	
	
	//외부에서 가져갈 수 있게 static으로 만듬 	
	public static Company getInstance() {
		
		//혹시나 null일경우 생성할 수 있게 만듬 	
		if(instance == null) {
			instance = new Company();
					}
		
		return instance;
	}

}
