package chapter_14;

public class Purchase extends AbstractColleague{
	public Purchase(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void buyIBMComputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}

	public void refuseBuy() {
		System.out.println("Do not buy IBM computer");
	}
}
