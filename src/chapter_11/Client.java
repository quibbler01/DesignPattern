package chapter_11;

import java.util.ArrayList;

public class Client {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		// CarModel benz = new Car
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");

		BenzBuilder builder = new BenzBuilder();
		builder.setSequence(sequence);
		CarModel ben = builder.getCarModle();
		ben.run();

	}

}
