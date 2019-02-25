package chapter_8;

public interface AbstractProductFactory {

	public <T extends Product> T madeProduct(Class<T> c);
}
