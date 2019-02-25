package chapter_14;

public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object... objects) {
		// TODO Auto-generated method stub
		if (str.equals("purchase.buy")) {
			this.buyComputer((Integer) objects[0]);
		} else if (str.equals("sale.sell")) {
			this.sellComputer((Integer) objects[0]);
		} else if (str.equals("sale.offsell")) {
			this.offSell();
		} else if (str.equals("stock.clear")) {
			this.clearStock();
		}
	}

	public void buyComputer(int number) {
		int saleStatus = super.sale.getSalesStatus();
		if (saleStatus > 80) {
			System.out.println("Buy computer:" + number + " 's");
			super.stock.increase(number);
		} else {
			int buyNumber = number / 2;
			System.out.println("Buy IBM computer:" + buyNumber);
		}
	}

	public void sellComputer(int number) {
		if (this.stock.getStockNumber() < number) {
			super.purchase.buyIBMComputer(number);
		}
		super.stock.increase(number);
	}

	public void offSell() {
		System.out.println("Discount computer number:" + this.stock.getStockNumber() + "'s");
	}

	public void clearStock() {
		super.sale.offSale();
		super.purchase.refuseBuy();
	}

}
