package chapter_11;

public class BMWCar extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW car start");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW car stop");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("BMW car alarm");
	}

	@Override
	protected void enginBoom() {
		// TODO Auto-generated method stub
		System.out.println("BMW car enginBoom");
	}

}
