package pr2.pu2;
/**
 * Represents a rabbit.
 * 
 * @param hp        The rabbits health points.
 * @param x         The rabbits location (x-coordinate).
 * @param y         The rabbits location (y-coordinate).
 * @param counter   Counts the number of rabbits created with the create()
 *                  method.
 */
public class Hase extends Tier {

	protected static int counter;
	/**
	 * The constructor for "Hase".
	 */
	protected Hase() {
		super(40);
	}
	/**
	 * Creates a rabbit.
	 * 
	 * @return An already running rabbit with always starting hp=40 and a name
	 *         depending on the number of animals already created.
	 */

	public static Hase create() {
		Hase hase = new Hase();
		Hase.counter++;
		hase.setName("Hase-" + String.format("%03d", Hase.counter));
		hase.start();
		return hase;
	}
}
