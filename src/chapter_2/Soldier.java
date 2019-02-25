package chapter_2;

public class Soldier {
	private AbstractGun gun;
	public void setGun(AbstractGun _gun) {
		this.gun = _gun;
	}
	public void killEnemy() {
		System.out.println("Soldier start kill...");
		gun.shoot();
	}
}
