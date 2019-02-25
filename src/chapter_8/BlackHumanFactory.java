package chapter_8;

public class BlackHumanFactory implements IHumanFactory {

	@Override
	public Human createHuman() {
		// TODO Auto-generated method stub
		return new BlackMan();
	}

}
