package chapter_14;

public class Stock extends AbstractColleague {
	public Stock(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	private static int COMPUTER_NUMBER = 100;

	public void increase(int number) {
		this.COMPUTER_NUMBER += number;
		System.out.println("Current stock number is " + COMPUTER_NUMBER);
	}

	public void decrease(int number) {
		this.COMPUTER_NUMBER -= number;
		System.out.println("Current stock number is " + COMPUTER_NUMBER);
	}

	public int getStockNumber() {
		return this.COMPUTER_NUMBER;
	}

	public void clearStock() {
		System.out.println("Clear stock number is:" + this.COMPUTER_NUMBER);
		super.mediator.execute("stock.clear");

	}

}
