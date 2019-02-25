package chapter_7;

public class Emperor {
	private static final Emperor EMPEROR = new Emperor();

	private Emperor() {
		// TODO Auto-generated constructor stub
	}
	
	public void say() {
		System.out.println("I am Qin Emperor");
	}
	public static Emperor getEmperor() {
		return EMPEROR;
	}
}
