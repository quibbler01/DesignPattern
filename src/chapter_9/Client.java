package chapter_9;

public class Client {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		AbstractCreator creator1 = new Creator1();
		AbstractProductA productA1 = creator1.createProductA();
		productA1.doSomething();

		AbstractProductA productA2 = new Creator2().createProductA();
		productA2.doSomething();
	}

}
