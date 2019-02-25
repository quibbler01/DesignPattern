package chapter_18;

public class Client {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new ConcreteStrategy2());
		context.executeStrategy();
	}

}
