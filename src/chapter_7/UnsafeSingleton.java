package chapter_7;
/**
 * 线程不安全的单例模式
 * @author 61444
 *
 */
public class UnsafeSingleton {
	private static UnsafeSingleton singleton = null;

	private UnsafeSingleton() {
		// TODO Auto-generated constructor stub
	}

	public static UnsafeSingleton getSingleton() {
		if (singleton == null) {
			singleton = new UnsafeSingleton();
		}
		return singleton;
	}
}
