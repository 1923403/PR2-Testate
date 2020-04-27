package pr2.pu2;

public class Hase extends Tier {
	static int hasenCounter = 0;

	
	protected Hase(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}

	public static Hase create() {
		Hase hase = new Hase(40);
		hasenCounter += 1;
		hase.setName("Hase-" + hasenCounter);

		hase.start();
		return hase;
	}

}
