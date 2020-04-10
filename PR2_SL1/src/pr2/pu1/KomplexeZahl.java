package pr2.pu1;

import pr2.pu1.KomplexeZahlKlein2.KZKException;

public class KomplexeZahl {
	private double re;
	private double im;

	// Konstruktor

	KomplexeZahl(double re, double im) {
		this.re = re;
		this.im = im;
	}

	// Getter
	//
	public double re() {
		return this.re;
	}

	public double im() {
		return this.im;
	}

	@Override
	public String toString() {
		return (re + " + " + im + "i");
	}

	public KomplexeZahl add(KomplexeZahl toAdd) {
		return new KomplexeZahl(toAdd.re() + this.re, toAdd.im() + this.im);
	}

	public KomplexeZahl prod(KomplexeZahl toMult) {
		return new KomplexeZahl(this.re * toMult.re() - this.im * toMult.im(),
				this.re * toMult.im() + toMult.re() * this.im);
	}

	public static void main(final String[] args) {
		KomplexeZahl x = new KomplexeZahl(2.5, 4.5);
		System.out.println("x=" + x);

		KomplexeZahlKlein1 d = null;
		try {
			d = new KomplexeZahlKlein1(15, 30);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		}
		System.out.println(d);
		KomplexeZahlKlein2 e = null;
		try {
			e = new KomplexeZahlKlein2(15, 5);
		} catch (KZKException exc) {
			// TODO Auto-generated catch block
			
			System.out.println(exc.getMessage());
		}
		System.out.println(e);

	}

}
