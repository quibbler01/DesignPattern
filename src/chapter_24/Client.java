package chapter_24;

public class Client {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
//		Originator originator = new Originator();
//		originator.setState("start");
//		System.out.println(originator.getState());
//
//		originator.createBackUp();
//		originator.setState("after");
//		System.out.println(originator.getState());
//
//		originator.restoreBackUp();
//		System.out.println(originator.getState());
		
		
		Ori ori = new Ori();
		Caretaker caretaker = new Caretaker();
		ori.setStatus1("1");
		ori.setStatus2("2");
		ori.setStatus3("3");
		System.out.println(ori);
		caretaker.setMemento(ori.createMemento());;
		ori.setStatus1("11");
		ori.setStatus2("22");
		ori.setStatus3("33");
		System.out.println(ori);
		ori.restoreMemto(caretaker.getMemento());
		System.out.println(ori);
	}

}
