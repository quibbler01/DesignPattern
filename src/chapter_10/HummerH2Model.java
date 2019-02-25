package chapter_10;

public class HummerH2Model extends HummerModel {

	@Override
	protected boolean isAlarm() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("H2 start");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("H2 stop");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("H2 DiDi");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("H2 Boom");
	}

}
