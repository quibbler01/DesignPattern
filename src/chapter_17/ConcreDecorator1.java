package chapter_17;

public class ConcreDecorator1 extends Decorator {

	public ConcreDecorator1(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	private void method1() {
		System.out.println("method1 decorator");
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.method1();
		super.operate();
	}
}
