package pr2.pu2;

public class Hase extends Tier {
	
	protected static int counter;

	public Hase() {
		super(40);
	}

	public static Hase create() {
		Hase hase = new Hase();
		Hase.counter++;
		hase.setName("Hase-" + String.format("%03d", Hase.counter));
		System.out.println(hase.getName());
		hase.start();
		return hase;
	}
}
