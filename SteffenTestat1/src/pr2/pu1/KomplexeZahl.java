package pr2.pu1;

public class KomplexeZahl {

	private final double re;
	private final double im;

	public double re() {
		return this.re;
	}

	public double im() {
		return this.im;
	}

	public KomplexeZahl(double realanteil, double imaginaeranteil) {
		this.re = realanteil;
		this.im = imaginaeranteil;
	}

	@Override
	public String toString() {
		return this.re + " + " + this.im + "i";
	}

	public KomplexeZahl add(KomplexeZahl kZ) {
		return new KomplexeZahl((this.re + kZ.re()), (this.im + kZ.im()));
	}

	public static KomplexeZahl add(KomplexeZahl kZ1, KomplexeZahl kZ2) {
		return new KomplexeZahl((kZ1.re() + kZ2.re()), (kZ1.im() + kZ2.im()));
	}

	public KomplexeZahl prod(KomplexeZahl kZ) {
		return new KomplexeZahl((this.re * kZ.re() - this.im * kZ.im()), (this.re * kZ.im() + this.im * kZ.re()));
	}

	public static KomplexeZahl prod(KomplexeZahl kZ1, KomplexeZahl kZ2) {
		return new KomplexeZahl((kZ1.re() * kZ2.re() - kZ1.im() * kZ2.im()),
				(kZ1.re() * kZ2.im() + kZ1.im() * kZ2.re()));
	}

	public static void main(String[] args) {
		KomplexeZahl x = new KomplexeZahl(2.5, 4.5);
		System.out.println("x = " + x);
	}
}
