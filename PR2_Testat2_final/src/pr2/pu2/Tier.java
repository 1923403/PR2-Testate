package pr2.pu2;
/**
 * @author Gruppe 25: Raphael (1926543), Steffen (1923403), Floris (1921233)
 *
 **/

/**
 * Represents an animal.
 * 
 * @param hp        The animals health points.
 * @param x         The animals location (x-coordinate).
 * @param y         The animals location (y-coordinate).
 * @param rng       A random number generator.
 * @param reference A reference to the animals own thread.
 * @param counter   Counts the number of animals created with the create()
 *                  method.
 */
public class Tier extends Thread {

	protected static int counter;
	protected static double rng = Math.random();
	protected Thread reference = Thread.currentThread();
	protected int hp, x, y;

	/**
	 * The constructor for "Tier".
	 * 
	 * @param hp The animals hp.
	 */
	protected Tier(int hp) {
		this.hp = hp;
	}

	/**
	 * The run method for the animal, which is realized as a Thread. Its lifecycle
	 * looks like this: move, lose one hp, sleep for 100ms, repeat until hp is zero.
	 */
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

	/**
	 * Creates an animal.
	 * 
	 * @return An already running animal with random starting hp and a name
	 *         depending on the number of animals already created.
	 */
	public static Tier create() {
		Tier tier = new Tier((int) (Math.random() * 100));
		Tier.counter++;
		tier.setName("Tier-" + String.format("%03d", Tier.counter));
		tier.start();
		return tier;
	}

	/**
	 * The animal moves in a random direction, represented by the x and y
	 * coordinates.
	 */
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

//		hasenstall.einsperren(new Tier((int) (Math.random() * 100)));

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
//		tierstall.einsperren(new Tier((int) (Math.random() * 100)));
//		tierstall.einsperren(new Tier((int) (Math.random() * 100)));
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
