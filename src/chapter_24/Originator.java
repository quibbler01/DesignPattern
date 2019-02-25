package chapter_24;

public class Originator implements Cloneable {
	private Originator backUp;

	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void createBackUp() {
		this.backUp = this.clone();
	}

	public void restoreBackUp() {
		this.setState(this.backUp.getState());
	}

	@Override
	protected Originator clone() {
		try {
			return (Originator) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
