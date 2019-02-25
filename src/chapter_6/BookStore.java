package chapter_6;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {
	private static final ArrayList<IBook> booklist = new ArrayList<IBook>();
	static {
		booklist.add(new NovelBook("One", 2, "Zhao"));
		booklist.add(new NovelBook("Two", 92, "Hhao"));
		booklist.add(new NovelBook("Three", 12, "Zhao"));
		booklist.add(new NovelBook("Four", 42, "Zhao"));
		booklist.add(new NovelBook("Five", 22, "Zhao"));
		booklist.add(new NovelBook("Six", 54, "Zhao"));
		booklist.add(new ComputerBook("JC", 24, "C++", "programe"));
	}

	public static void main_(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		numberFormat.setMaximumFractionDigits(2);
		System.out.println("Book Store saled book");
		for (int i = 0; i < booklist.size(); ++i) {
			System.out.println(booklist.get(i).getName() + "\t" + booklist.get(i).getAuthor() + "\t"
					+ numberFormat.format(booklist.get(i).getPrice()));

		}
	}

}
