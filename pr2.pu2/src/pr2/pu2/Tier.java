package pr2.pu2;


public class Tier extends Thread {
	protected int x, y, hp;
	static int counter = 0;
	protected static int rng = (int) (Math.random() * 100);

	protected Tier(int hp) {
		this.hp = hp;
	}
	

	public static void main(String[] args) {
		Tier a = new Tier(33);
		a.start();


	}


	public void run() {
		while (hp > 0) {
			this.move();
			hp -= 1;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName() + " has " + hp + " and is at x = "+x+" and y = "+y);

		}
	}

	public static Tier create() {
		Tier tier = new Tier(rng);
		counter += 1;
		tier.setName("Tier-" + counter);

		tier.start();
		return tier;
	}

	public void move() {
		int d = (int) (Math.random() * 5);
		if (d == 1) {
			x += 1;
		} else if (d == 2) {
			x -= 1;
		} else if (d == 3) {
			y += 1;
		} else if (d == 4) {
			y -= 1;
		} else {
			}
		

	}

}