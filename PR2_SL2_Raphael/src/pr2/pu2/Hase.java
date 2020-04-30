package pr2.pu2;

public class Hase extends Tier {
	static int hasenCounter = 0;

	protected Hase() {
		super(40);
		// TODO Auto-generated constructor stub
	}

	public static Hase create() {
		Hase hase = new Hase();
		hasenCounter += 1;
		hase.setName("Hase-" + String.format("%03d", Hase.counter));
		hase.start();
		return hase;
	}

}
