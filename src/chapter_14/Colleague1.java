package chapter_14;

public class Colleague1 extends Colleague {

	public Colleague1(MediatorT mediatorT) {
		super(mediatorT);
	}

	public void doSelf() {
		System.out.println("C1 self");
	}

	public void doDep() {
		super.mediatorT.doSomething1();
	}
}
