package chapter_16;

public class Husband extends Handler {
	public Husband() {
		super(Handler.HUSBAND_LEVEL_REQUEST);
	}

	@Override
	public void response(IWomen women) {
		// TODO Auto-generated method stub
		System.out.println("Wife request to husbans");
		System.out.println(women.getRequest());
		System.out.println("Husband agree");
	}

}
