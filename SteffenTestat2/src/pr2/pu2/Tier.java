package pr2.pu2;

public class Tier extends Thread {

//	protected static double rng;
	protected static int counter;
	protected int health;
//	protected int reference;
	protected int x;
	protected int y;
//	protected String name;

	protected Tier(int health) {
		this.health = health;
	}

	public void run() {
		for (int i = this.health; i >= 0; i--) {
			System.out.println(this.getName());
			System.out.println("health: " + i);
			this.move();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Tier.create();

		System.out.println("x = " + this.x);
		System.out.println("y = " + this.y);
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
//		Tier tier = new Tier(33);
//		tier.start();

		Tier.create();
		Tier.create();
		Tier.create();
	}
}
