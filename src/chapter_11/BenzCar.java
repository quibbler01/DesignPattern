package chapter_11;

public class BenzCar extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("Benz car start");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("Benz car stop");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("Benz car alarm");
	}

	@Override
	protected void enginBoom() {
		// TODO Auto-generated method stub
		System.out.println("Benz car enginBoom");
	}

}
