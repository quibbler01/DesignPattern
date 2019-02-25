package chapter_4;

public class PettyGirl implements IGoodBodyGirl, IGreateTemperament {
	private String name;

	public PettyGirl(String name) {
		this.name = name;
	}
	public void greatTemperament() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"---has greate temperament");
	}

	@Override
	public void goodLooking() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"---has good faceing");
	}

	@Override
	public void niceFigure() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"---has fit body");
	}

}
