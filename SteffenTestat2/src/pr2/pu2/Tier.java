package pr2.pu2;

public class Tier {

	protected int x;
	protected int y;
	protected int health;
	
	protected Tier(int health) {
		this.health = health;
	}
	
	for (int i = this.health; i <= 0; i--) {
		Thread.sleep(100);
	}
}
