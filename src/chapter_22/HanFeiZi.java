package chapter_22;

public class HanFeiZi implements IHanFeiZi {

	private boolean isHavingBreakfast = false;
	private boolean isHaveFun = false;

	@Override
	public void haveBreakfast() {
		// TODO Auto-generated method stub
		System.out.println("Haveing Breakfast");
		isHavingBreakfast = true;
	}

	@Override
	public void haveFun() {
		// TODO Auto-generated method stub
		System.out.println("Having Fun");
		isHaveFun = true;
	}

	public boolean isHavingBreakfast() {
		return isHavingBreakfast;
	}

	public void setHavingBreakfast(boolean isHavingBreakfast) {
		this.isHavingBreakfast = isHavingBreakfast;
	}

	public boolean isHaveFun() {
		return isHaveFun;
	}

	public void setHaveFun(boolean isHaveFun) {
		this.isHaveFun = isHaveFun;
	}

}
