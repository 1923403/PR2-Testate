package pr2.pu2;

public class Hase extends Tier {

	public Hase() {
		super(40);
	}

	public static Hase create() {
		Hase hase = new Hase();
		hase.start();
		Hase.instanceNumber++;
		hase.setName();
		return hase;
	}
}
