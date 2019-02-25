package chapter_22;

public class LiSi implements ILiSi {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("LiSi:wantching hanfeizi activate,start report to boss...");
		this.reportToQinShiHuang(context);
		System.out.println("LiSi:report Done");
	}

	private void reportToQinShiHuang(String reportContext) {
		System.out.println("LiSi:report,boss,HanFeiZi has new activites--->" + reportContext);
	}
}
