package chapter_14;

public abstract class MediatorT {
	protected Colleague1 c1;
	protected Colleague2 c2;

	public Colleague1 getC1() {
		return c1;
	}

	public void setC1(Colleague1 c1) {
		this.c1 = c1;
	}

	public Colleague2 getC2() {
		return c2;
	}

	public void setC2(Colleague2 c2) {
		this.c2 = c2;
	}
	public abstract void doSomething1();
	public abstract void doSomething2();
}
