/**
 * 
 */
package chapter_7;

/**
 * @author 61444
 *
 */
public class Singleton {
	private static final Singleton SINGLESON = new Singleton();

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getSingleton() {
		return SINGLESON;
	}
	public void doSomething() {
		//...
	}
}
