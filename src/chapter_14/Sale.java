package chapter_14;

import java.net.Socket;
import java.util.Random;

public class Sale extends AbstractColleague{
	public Sale(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void sellIBMComputer(int number) {
		super.mediator.execute("sale.sell", number);
	}

	public int getSalesStatus() {
		Random random = new Random(System.currentTimeMillis());
		int saleStatus = random.nextInt(100);
		System.out.println("IBM sales:" + saleStatus);
		return saleStatus;
	}

	public void offSale() {
		super.mediator.execute("sale.offsell");
	}
}
