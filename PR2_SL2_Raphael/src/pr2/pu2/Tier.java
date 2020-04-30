package pr2.pu2;

import java.util.Iterator;

public class Tier extends Thread {
	protected int x, y, hp;
	protected static int counter = 0;
	protected static double rngSeed = Math.random();
	protected Thread reference = Thread.currentThread();

	protected Tier(int hp) {
		this.hp = hp;
	}

	@Override
	public void run() {
		while (hp > 0) {
			this.move();
			this.hp--;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.getName() + " has " + hp + " and is at x = " + x + " and y = " + y);
		}
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
//		A2
//		Tier tier = new Tier(33);
//		tier.start();
		
//		A7
//		var hasenstall = new ArtenGehege<Hase>();
//		var hase1 = new Hase();		
//		var hase2 = new Hase();
//		var hase3 = new Hase();
//		hasenstall.einsperren(hase1);
//		hasenstall.einsperren(hase2);
//		hasenstall.einsperren(hase3);
//		System.out.println(hasenstall.size());
		
//		A8
		ArtenGehege<Hase> hasenstall = new ArtenGehege<>();

		var hase1 = new Hase();		
		var hase2 = new Hase();
		var hase3 = new Hase();

		hasenstall.einsperren(hase1);
		hasenstall.einsperren(hase2);
		hasenstall.einsperren(hase3);

		System.out.println(hasenstall.size());

		Iterator<Hase> it = hasenstall.iterator();
		while (it.hasNext()) {

			System.out.println(it.next().hp);
		}

	}
}
