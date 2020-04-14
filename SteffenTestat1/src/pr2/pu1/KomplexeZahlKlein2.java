package pr2.pu1;

public class KomplexeZahlKlein2 extends KomplexeZahl {

	public KomplexeZahlKlein2(double realanteil, double imaginaeranteil) throws KZKException {
		super(realanteil, imaginaeranteil);

		if (imaginaeranteil > 10) {
			throw new KZKException();
		}
	}

	@SuppressWarnings("serial")
	public class KZKException extends Exception {
		
		@Override
		public String getMessage() {
			try {
				new KomplexeZahlKlein1(KomplexeZahlKlein2.this.re(), KomplexeZahlKlein2.this.im());
			} catch (Exception e) {
				return e.getMessage();
			}

			return null;
		}
	}
}
