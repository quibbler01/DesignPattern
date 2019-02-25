package chapter_11;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
	private BMWCar bmw = new BMWCar();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.bmw.setSequence(sequence);
	}

	@Override
	public CarModel getCarModle() {
		// TODO Auto-generated method stub
		return bmw;
	}

}
