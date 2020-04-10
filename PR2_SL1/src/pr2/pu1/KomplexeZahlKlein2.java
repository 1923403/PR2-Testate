package pr2.pu1;

public class KomplexeZahlKlein2 extends KomplexeZahl {

	KomplexeZahlKlein2(double re, double im) throws KZKException {
		super(re, im);

		if (im > 10) {
			throw new KZKException();

		}

	}

	public class KZKException extends Throwable {

		public String getMessage() {
			try(
					new KomplexeZahl1())
			return ("Imaginärteil größer 10! Realteil ist " + this.re());

		}
	}
}
