package chapter_10;

public class HummerH1Model extends HummerModel {
	private boolean alarmFlag = true;

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("H1 start");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("H1 stop");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("DiDi");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("Boom");
	}

	public void setAlarmFlag(boolean alarmFlag) {
		this.alarmFlag = alarmFlag;
	}

	@Override
	protected boolean isAlarm() {
		// TODO Auto-generated method stub
		return this.alarmFlag;
	}

}
