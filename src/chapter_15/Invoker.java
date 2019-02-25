package chapter_15;

public class Invoker {
	private Command command;

	public void action() {
		command.execute();
	}

	public void setCommand(Command command) {
		this.command = command;
	}

}
