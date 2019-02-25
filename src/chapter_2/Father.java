package chapter_2;

import java.util.Collection;
import java.util.Map;

public class Father {
	public Collection<?> doSomething(Map<?, ?> map){
		System.out.println("Father has been executed");
		return map.values();
	}
}
