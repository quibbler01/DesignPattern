package chapter_10;

public abstract class HummerModel {
	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	final public void run() {
		start();
		engineBoom();
		if (isAlarm()) {
			alarm();
		}
	}

	protected boolean isAlarm() {
		return true;
	}
}
