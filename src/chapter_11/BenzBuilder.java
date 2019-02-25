package chapter_11;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
	private BenzCar benz = new BenzCar();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModle() {
		// TODO Auto-generated method stub
		return this.benz;
	}

}
