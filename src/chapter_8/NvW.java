package chapter_8;

public class NvW {

	public static void main_(String[] args) {
//		AbstractHumanFactory factory = new HumanFactory();
//		System.out.println("First time to create human");
//		Human whiteHuman = factory.createHuman(WhiteMan.class);
//		whiteHuman.getColor();
//		whiteHuman.talk();
//
//		System.out.println("Second time to create human");
//		Human blankHuman = factory.createHuman(BlackMan.class);
//		blankHuman.getColor();
//		blankHuman.talk();
//
//		System.out.println("Third time to create human");
//		Human yellowHuman = factory.createHuman(YellowMan.class);
//		yellowHuman.getColor();
//		yellowHuman.talk();
		
		System.out.println("First time to create human");
		Human whiteHuman = (new WhiteHumanFactory()).createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();

		System.out.println("Second time to create human");
		Human blankHuman = (new BlackHumanFactory()).createHuman();
		blankHuman.getColor();
		blankHuman.talk();

		System.out.println("Third time to create human");
		Human yellowHuman = (new YellowHumanFactory()).createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
		
	}

}
