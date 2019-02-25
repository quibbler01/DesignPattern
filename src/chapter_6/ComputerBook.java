package chapter_6;

public class ComputerBook implements IComputerBook {
	private String name;
	private int price;
	private String author;
	private String scope;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public ComputerBook(String name, int price, String author, String scope) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.scope = scope;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
	}

	@Override
	public String getScope() {
		// TODO Auto-generated method stub
		return scope;
	}

}
