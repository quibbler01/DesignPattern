package chapter_15;

public class ConcreteCommand2 extends Command {
	Receiver receive;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receive.doSomething();
		System.out.println("Execute by Command2");
	}

	public void setReceive(Receiver receive) {
		this.receive = receive;
	}

	public ConcreteCommand2(Receiver receive) {
		super();
		this.receive = receive;
	}

}
