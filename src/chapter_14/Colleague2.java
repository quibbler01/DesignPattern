package chapter_14;

public class Colleague2 extends Colleague {

	public Colleague2(MediatorT mediatorT) {
		super(mediatorT);
	}

	public void doSelf() {
		System.out.println("C2 self");
	}

	public void doDep() {
		super.mediatorT.doSomething1();
	}
}
