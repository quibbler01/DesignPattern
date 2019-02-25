package chapter_22;

import java.util.ArrayList;
import java.util.Iterator;

public class HanFei implements OBservable {
	private ArrayList<Observer> observeList = new ArrayList<Observer>();

	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observeList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observeList.remove(observer);
	}

	@Override
	public void notifyAllObserver(String context) {
		// TODO Auto-generated method stub
		for (Observer observer : observeList) {
			observer.update(context);
		}
	}

	public void haveBreakfast() {
		System.out.println("HanFeiZi:haveing breakfast");
		this.notifyAllObserver("HanFeiZi having breakfast");
	}

	public void haveFun() {
		System.out.println("HanFeiZi:having Fun");
		this.notifyAllObserver("Having Fun");
	}

}
