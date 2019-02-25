package chapter_20;

import java.util.Iterator;

public class Client {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAggregate aggregate = new ConcreteAggregate();
		aggregate.add("a");
		aggregate.add("b");
		aggregate.add("c");

		Iterator<String> iterator = aggregate.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

	}

}
