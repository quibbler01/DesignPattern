package chapter_20;

import java.util.Iterator;
import java.util.Vector;

public class ConcreteIterator implements Iterator<String> {
	private Vector<String> vector = new Vector<String>();
	private int cursor = 0;

	public ConcreteIterator(Vector<String> vector) {
		this.vector = vector;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (this.cursor == this.vector.size()) {
			return false;
		}
		return true;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		String result = "";
		if (this.hasNext()) {
			result = this.vector.get(this.cursor++);
		}
		return result;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if (this.cursor>0) {
			this.vector.remove(this.cursor--);
		}
	}

}
