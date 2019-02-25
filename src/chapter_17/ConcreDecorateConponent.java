package chapter_17;

public class ConcreDecorateConponent extends Decorator {

	public ConcreDecorateConponent(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	private void method2() {
		System.out.println("method2");
	}

	@Override
	public void operate() {
		super.operate();
		this.method2();
	}
}
