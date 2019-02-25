package chapter_7;

import java.util.ArrayList;
import java.util.Random;

public class MutileSingleton {
	private static ArrayList<MutileSingleton> singletons = new ArrayList<MutileSingleton>();
	private static ArrayList<String> names = new ArrayList<String>();
	private static int num = 0;

	private MutileSingleton() {

	}

	private MutileSingleton(String name) {
		names.add(name);
	}

	static {
		for (int i = 0; i < 3; ++i) {
			singletons.add(new MutileSingleton("Emperor of " + i));
		}
	}

	public static MutileSingleton getSingleton() {
		Random random = new Random();
		num = random.nextInt(3);
		return singletons.get(num);
	}

	public void say() {
		System.out.println("I am the " + num + "th Emperor");
	}
}
