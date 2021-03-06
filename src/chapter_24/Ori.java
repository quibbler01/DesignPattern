package chapter_24;

public class Ori {
	private String status1 = "";
	private String status2 = "";
	private String status3 = "";

	public String getStatus1() {
		return status1;
	}

	public void setStatus1(String status1) {
		this.status1 = status1;
	}

	public String getStatus2() {
		return status2;
	}

	public void setStatus2(String status2) {
		this.status2 = status2;
	}

	public String getStatus3() {
		return status3;
	}

	public void setStatus3(String status3) {
		this.status3 = status3;
	}

	public Memento createMemento() {
		return new Memento(BeanUtils.backUpProp(this));
	}

	public void restoreMemto(Memento memento) {
		BeanUtils.restoreProp(this, memento.getStateMap());
	}

	public String toString() {
		return status1 + " " + status2 + " " + status3;
	}
}
