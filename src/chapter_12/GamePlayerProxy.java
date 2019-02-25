package chapter_12;

public class GamePlayerProxy implements IGamePlayer {
	private GamePlayer player;

	public GamePlayerProxy(GamePlayer player) {
		this.player = player;
	}

	@Override
	public void login(String name, String password) {
		// TODO Auto-generated method stub
		this.player.login(name, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.player.killBoss();
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.player.upgrade();
	}

}
