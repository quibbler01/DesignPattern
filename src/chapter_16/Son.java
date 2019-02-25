package chapter_16;

public class Son extends Handler {
	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(IWomen women) {
		// TODO Auto-generated method stub
		System.out.println("Mom request to son");
		System.out.println(women.getRequest());
		System.out.println("Son agree");
	}

}
