package pr2.pu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
		var hasenstall = new ArtenGehege<Hase>();
		for (int i = 0; i < 3; i++) 
			hasenstall.einsperren(new Hase());
		

		
		// A8 & A9
		var tierStall = new ArtenGehege<Tier>();
		tierStall.einsperren(Tier.create());
		tierStall.einsperren(new Tier(7));
		tierStall.einsperren(new Tier(2));
		
		var hasenStall = new ArtenGehege<Hase>();
		hasenStall.einsperren(new Hase());
		
		HashMap<String, ArtenGehege<?>> zooMap = new HashMap<String, ArtenGehege<?>>();
		zooMap.put("Tierstall",tierStall);
		zooMap.put("Hasenstall",hasenStall);
		
		
		ArrayList<Tier> all = new ArrayList<>();
		
		all.addAll(tierStall);
		all.addAll(hasenStall);
		

		Collections.sort(all, new HpComparator());
		
		Iterator<Tier> it = all.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().hp);
		}

//		System.out.println("\nSorted by hp");
//		for (int i = 0; i < tierStall.size(); i++)
//		System.out.println(tierStall.get(i));
		
//		System.out.println(hasenstall.size());



//		Iterator<Hase> it = hasenstall.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next().hp);
//		}

	}
}
