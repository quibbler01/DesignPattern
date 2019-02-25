package chapter_13;

import java.util.ArrayList;

public class TestDeepClone implements Cloneable {
	private ArrayList<String> arrayList = new ArrayList<String>();

	@Override
	protected TestDeepClone clone() {
		TestDeepClone testDeepClone = null;
		try {
			testDeepClone = (TestDeepClone) super.clone();
			testDeepClone.arrayList = (ArrayList<String>)this.arrayList.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testDeepClone;
	}

	public void setValue(String value) {
		this.arrayList.add(value);
	}

	public ArrayList<String> getValue() {
		return this.arrayList;
	}
}
