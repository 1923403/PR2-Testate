package pr2.pu2;

public class Hase extends Tier {
	protected static int counter = 0;

	protected Hase() {
		super(40);
	}

	public static Hase create() {
		Hase.counter++;
		Hase hase = new Hase();
		hase.setName("Hase-" + String.format("%03d", Hase.counter));
		hase.start();
		return hase;
	}

}
