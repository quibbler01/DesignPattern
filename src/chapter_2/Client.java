package chapter_2;

import java.util.HashMap;

public class Client {

	public static void main__(String[] args) {
		//Father father = new Father();
		Son son = new Son();
		son.doSomething(new HashMap<Integer, Integer>());
	}
	
	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		Soldier sanMao = new Soldier();
		sanMao.setGun(new Rifle());
		sanMao.killEnemy();
	}

}
