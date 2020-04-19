package pr2.pu1;

/**
 * This is a subclass from {@link KomplexeZahl}
 * 
 *
 */
public class KomplexeZahlKlein2 extends KomplexeZahl {
	/**
	 * 
	 * @param realanteil      : real part
	 * @param imaginaeranteil : imaganary part
	 * @throws KZKException : throws a Exeception if the imganary part > 10
	 * 
	 * @category constructor
	 */
	public KomplexeZahlKlein2(double realanteil, double imaginaeranteil) throws KZKException {
		super(realanteil, imaginaeranteil);

		if (this.im() > 10) {
			throw new KZKException();
		}
	}

	/**
	 * This is a inner Exception of {@link KomplexeZahlKlein2} And is trown if the
	 * imaganary part > 10
	 * 
	 * @category Exception
	 */

	@SuppressWarnings("serial")
	public class KZKException extends Exception {

//		@Override
//		public String getMessage() {
//			try {
//				new KomplexeZahlKlein1(KomplexeZahlKlein2.this.re(), KomplexeZahlKlein2.this.im());
//			} catch (Exception e) {
//				return e.getMessage();
//			}
//
//			return null;
//		}

		@Override
		public String getMessage() {
			return "Die Zahl fuer den imaginaeren Anteil ist zu groﬂ!\nReeller Anteil: " + KomplexeZahlKlein2.this.re();
		}
	}
}
