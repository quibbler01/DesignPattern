package chapter_24;

import java.util.HashMap;

public class Memento {
	private HashMap<String, Object> statMap;

	public Memento(HashMap<String, Object> map) {
		this.statMap = map;
	}

	public HashMap<String, Object> getStateMap() {
		return statMap;
	}

	public void setStatusMap(HashMap<String, Object> map) {
		this.statMap = map;
	}
}
