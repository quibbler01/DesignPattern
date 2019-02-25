package chapter_12;

public class GamePlayer implements IGamePlayer {
	private String name;

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String name, String password) {
		// TODO Auto-generated method stub
		System.out.println("Login:" + name);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println("Kill Boss");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println("User " + name + "Upgrade");
	}

}
