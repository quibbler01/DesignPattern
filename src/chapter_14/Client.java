package chapter_14;

public class Client {

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		AbstractMediator mediator = new Mediator();
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMComputer(100);
		
		Sale sale  =new Sale(mediator);
		sale.sellIBMComputer(1);
		
		Stock stock = new Stock(mediator);
		stock.clearStock();
		
	}

}
