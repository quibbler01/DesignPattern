package chapter_22;

public class ZhangSiSi implements Observer {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		this.reporToQinShiHuang(context);
		System.out.println("ZhangSiSi report done");
	}

	private void reporToQinShiHuang(String context) {
		System.out.println("ZhangSiSi report to QinShiHuang");
	}
}
