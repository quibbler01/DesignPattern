package chapter_15;

public class Client {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		Command command = new ConcreteCommand2(new ConcreteReceiver2());
		//command.execute();
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.action();
	}

}
