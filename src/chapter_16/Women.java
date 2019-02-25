package chapter_16;

public class Women implements IWomen {
	private int type;
	private String request;

	@Override

	public int getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	public Women(int type, String request) {
		this.type = type;
		switch (type) {
		case 1:
			this.request = "Daughter" + request;
			break;
		case 2:
			this.request = "Wife " + request;
			break;
		case 3:
			this.request = "Mom " + request;
			break;
		default:
			break;
		}
	}

	@Override
	public String getRequest() {
		// TODO Auto-generated method stub
		return this.request;
	}

}
