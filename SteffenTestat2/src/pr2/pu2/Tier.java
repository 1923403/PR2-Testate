package pr2.pu2;

public class Tier extends Thread {

	protected static int counter;
	protected static double rng = Math.random();
	protected Thread reference = Thread.currentThread();
	protected int health;
	
	public int getHealth() {
		return health;
	}

	protected int x;
	protected int y;

	protected Tier(int health) {
		this.health = health;
	}

	public void run() {
		while (health > 0) {
			this.move();
			this.health--;

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(this.getName() + " / " + String.format("%02d", this.health) + " Lebenspunkte / x = " + this.x
				+ " / y = " + this.y);
	}

	public static Tier create() {
		Tier tier = new Tier((int) (Math.random() * 100));
		Tier.counter++;
		tier.setName("Tier-" + String.format("%03d", Tier.counter));
		tier.start();
		return tier;
	}

	public synchronized void move() {
		switch ((int) (Math.random() * 5)) {
		case 0:
			break;
		case 1:
			this.x++;
			break;
		case 2:
			this.x--;
			break;
		case 3:
			this.y++;
			break;
		case 4:
			this.y--;
			break;
		}
	}

	public static void main(String[] args) {
		Tier tier = new Tier(33);
		tier.start();
	}
}
