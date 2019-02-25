package chapter_8;

public class WhiteHumanFactory implements IHumanFactory {

	@Override
	public Human createHuman() {
		// TODO Auto-generated method stub
		return new YellowMan();
	}

}
