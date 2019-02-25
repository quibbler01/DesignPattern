package chapter_16;

import java.util.ArrayList;
import java.util.Random;

public class Client {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		ArrayList<IWomen> womens = new ArrayList<IWomen>();
		for (int i = 0; i < 5; ++i) {
			womens.add(new Women(random.nextInt(4), "Shopping"));
		}
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		father.setNext(husband);
		husband.setNext(son);
		for (IWomen iWomen : womens) {
			father.HandleMessage(iWomen);
			System.out.println();
		}
	}

}
