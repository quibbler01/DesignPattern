package chapter_15;

public class ConcreteCommand1 extends Command {
	Receiver receive;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receive.doSomething();
		System.out.println("Execute by Command1");
	}

	public void setReceive(Receiver receive) {
		this.receive = receive;
	}

	public ConcreteCommand1(Receiver receive) {
		this.receive = receive;
	}

}
