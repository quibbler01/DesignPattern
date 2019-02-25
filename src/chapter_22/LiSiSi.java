package chapter_22;

public class LiSiSi implements Observer {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		this.reportToQinShiHuang(context);
		System.out.println("LiSiSi report done");
	}

	private void reportToQinShiHuang(String context) {
		System.out.println("LiSiSi Reporting");
	}
}
