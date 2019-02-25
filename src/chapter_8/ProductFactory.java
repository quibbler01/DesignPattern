package chapter_8;

public class ProductFactory implements AbstractProductFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T madeProduct(Class<T> c) {
		Product product = null;
		try {
			product = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (T) product;
	}

}
