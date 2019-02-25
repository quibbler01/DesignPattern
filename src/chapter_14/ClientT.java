package chapter_14;

public class ClientT {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		MediatorT mediatorT = new ConcreteMediatorT();
		Colleague colleague1 = new Colleague1(mediatorT), colleague2 = new Colleague2(mediatorT);
		mediatorT.setC1((Colleague1) colleague1);
		mediatorT.setC2((Colleague2) colleague2);

		colleague1.mediatorT.doSomething2();
	}

}
