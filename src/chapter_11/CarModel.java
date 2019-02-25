package chapter_11;

import java.util.ArrayList;

public abstract class CarModel {
	private ArrayList<String> sequence = new ArrayList<String>();

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void enginBoom();

	final public void run() {
		for (int i = 0; i < sequence.size(); i++) {
			String action = this.sequence.get(i);
			if (action.equalsIgnoreCase("start")) {
				start();
			} else if (action.equalsIgnoreCase("stop")) {
				stop();
			} else if (action.equalsIgnoreCase("alarm")) {
				alarm();
			} else if (action.equalsIgnoreCase("engine boom")) {
				enginBoom();
			}
		}
	}

	final public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
}
