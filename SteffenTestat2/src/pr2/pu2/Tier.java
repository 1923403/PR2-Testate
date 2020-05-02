package pr2.pu2;

import java.util.Random;

public class Tier extends Thread {

	protected static int counter;
	protected static Random rng = new Random();
	protected Thread reference = Thread.currentThread();
	protected int hp, x, y;

	protected Tier(int hp) {
		this.hp = hp;
	}

	public void run() {
		while (hp > 0) {
			this.move();
			this.hp--;

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}

			/*
			 * Ablauftest
			 */
//			System.out.println(this.getName() + ", " + this.hp + " HP, x: " + this.x + ", y: " + this.y);
		}
	}

	public static Tier create() {
		Tier tier = new Tier(rng.nextInt(100));
		Tier.counter++;
		tier.setName("Tier-" + String.format("%03d", Tier.counter));
		tier.start();
		return tier;
	}

	public synchronized void move() {
		switch ((int) (rng.nextInt(5))) {
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
		/*
		 * Aufgabe 2
		 */
//		Tier tier = new Tier(33);
//		tier.start();

		/*
		 * Aufgabe 3
		 */
//		Tier.create();
//		Tier.create();

		/*
		 * Ausgabe 4
		 */
//		Hase.create();
//		Hase.create();

		/*
		 * Aufgabe 7
		 */
//		var hasenstall = new ArtenGehege<Hase>();
//		hasenstall.einsperren(Hase.create());
//		hasenstall.einsperren(new Hase());
//		hasenstall.einsperren(new Hase());
//
//		hasenstall.einsperren(new Tier(Tier.rng.nextInt(100)));

		/*
		 * Aufgabe 8 + 9
		 */
//		var zoo = new Zoo();
//
//		var hasenstall = new ArtenGehege<Hase>();
//		hasenstall.einsperren(new Hase());
//		hasenstall.einsperren(new Hase());
//
//		var tierstall = new ArtenGehege<Tier>();
//		tierstall.einsperren(new Tier((int) (Tier.rng.nextInt(100))));
//		tierstall.einsperren(new Tier((int) (Tier.rng.nextInt(100))));
//
//		zoo.map.put("Hasenstall", hasenstall);
//		zoo.map.put("Tierstall", tierstall);
//
//		var iterator = zoo.iterator();
//
//		while (iterator.hasNext())
//			System.out.println(iterator.next().hp);
	}
}
