package chapter_9;

public class Creator1 extends AbstractCreator {

	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

}
