package pr2.pu2;

public class Hase extends Tier {
	static int counter = 0;

	protected Hase() {
		super(40);
		// TODO Auto-generated constructor stub
	}

	public static Hase create() {
		Hase.counter += 1;
		Hase hase = new Hase();
		
		hase.setName("Hase-" + String.format("%03d", Hase.counter));
		hase.start();
		return hase;
	}

}
