package chapter_16;

public class Father extends Handler {

	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	@Override
	public void response(IWomen women) {
		// TODO Auto-generated method stub
		System.out.println("Daughter request to father");
		System.out.println(women.getRequest());
		System.out.println("Father agree");
	}

}
