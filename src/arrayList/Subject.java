package arrayList;

public class Subject {

	//어떤과목이 몇 점 이다 - 참조자료형 	
	private String name;
	private int score;
	
	public Subject(String name, int score) {
		this.name = name;
		this.score = score;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
