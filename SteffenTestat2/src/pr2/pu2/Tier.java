package pr2.pu2;

public class Tier extends Thread {

	protected static int instanceNumber;
	protected int x;
	protected int y;
	protected int health;
	protected int rNG = (int) (Math.random() * 100);
	protected String name;

	protected Tier(int health) {
		this.health = health;
	}

	public void run() {
		for (int i = this.health; i >= 0; i--) {
//			System.out.println(name);
//			System.out.println("health: " + i);
			this.move();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		System.out.println("x = " + this.x);
//		System.out.println("y = " + this.y);
	}

	public static Tier create() {
		Tier tier = new Tier((int) (Math.random() * 100));
		tier.start();
		Tier.instanceNumber++;
		tier.setName();
		return tier;
	}

	protected void setName() {
		this.name = "Tier-" + String.format("%03d", instanceNumber);
	}

	public void move() {
		int random = (int) (Math.random() * 5);

		switch (random) {
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

		Tier.create();
	}
}
