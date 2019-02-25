package chapter_20;

import java.util.Iterator;
import java.util.Vector;

public class ConcreteAggregate {
	private Vector<String> vector = new Vector<String>();

	public void add(String string) {
		this.vector.add(string);
	}

	public Iterator<String> iterator() {
		return this.vector.iterator();
	}

}
