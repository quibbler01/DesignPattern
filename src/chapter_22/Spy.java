package chapter_22;

public class Spy extends Thread {
	private HanFeiZi hanFeiZi;
	private LiSi liSi;
	private String type;

	public Spy(HanFeiZi hanFeiZi, LiSi liSi, String type) {
		this.hanFeiZi = hanFeiZi;
		this.liSi = liSi;
		this.type = type;
	}

	@Override
	public void run() {
		while (true) {
			if (this.type.equals("breakfast")) {
				if (this.hanFeiZi.isHavingBreakfast()) {
					this.liSi.update("HanFeiZi is having breakfast...");
					this.hanFeiZi.setHavingBreakfast(false);
				}
			} else {
				if (this.hanFeiZi.isHaveFun()) {
					this.liSi.update("HanFeiZi is haveing fun");
					this.hanFeiZi.setHaveFun(false);
				}
			}
		}
	}

}
