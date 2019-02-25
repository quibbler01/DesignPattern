package chapter_6;

public class NovelBook implements IBook {
	private String name;
	private int price;
	private String author;

	public NovelBook(String name, int price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return this.author;
	}

}
