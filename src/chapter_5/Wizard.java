package chapter_5;

import java.util.Random;

public class Wizard {
	private Random random = new Random(System.currentTimeMillis());

	private int first() {
		System.out.println("First step");
		return random.nextInt(100);
	}

	private int second() {
		System.out.println("second step");
		return random.nextInt(100);
	}

	private int third() {
		System.out.println("third step");
		return random.nextInt(100);
	}

	public void install() {
		int first = first();
		if (first > 50) {
			int second = second();
			if (second > 50) {
				int third = third();
				if (third > 50) {
					System.out.println("install complete");
				}
			}
		}
	}
}
