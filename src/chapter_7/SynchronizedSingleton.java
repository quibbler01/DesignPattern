package chapter_7;

public class SynchronizedSingleton {
	private static SynchronizedSingleton singleton = null;

	private SynchronizedSingleton() {
		// TODO Auto-generated constructor stub
	}

	synchronized public static SynchronizedSingleton getSingleton() {
		if (singleton == null) {
			singleton = new SynchronizedSingleton();
		}
		return singleton;
	}
}
