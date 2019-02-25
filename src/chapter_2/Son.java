package chapter_2;

import java.util.Collection;
import java.util.HashMap;

public class Son extends Father {
	public Collection<?> doSomething(HashMap<?, ?> map){
		System.out.println("Son has been executed");
		return map.values();
	}
}
