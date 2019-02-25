package chapter_22;

public interface OBservable {
	public void addObserver(Observer observer);

	public void deleteObserver(Observer observer);

	public void notifyAllObserver(String context);
}
