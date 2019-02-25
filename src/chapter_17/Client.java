package chapter_17;

public class Client {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		Component component = new ConcreteDecotate2();
		Decorator decorator = new ConcreDecorator1(component);
		decorator = new ConcreDecorateConponent(decorator);
		decorator.operate();
	}

}
