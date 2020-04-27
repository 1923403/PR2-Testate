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
	 * @param imaginaeranteil : imaginary part
<<<<<<< HEAD
	 * @throws KZKException : throws an Exception if the imaginary part > 10
=======
	 * @throws KZKException : throws a Exeception if the imaginary part > 10
>>>>>>> branch 'master' of https://github.com/JohnDoe2209/PR2-Testate.git
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
	 * This is a inner Exception of {@link KomplexeZahlKlein2} And is thrown if the
	 * imaginary part > 10
	 * 
	 * @category Exception
	 */

	@SuppressWarnings("serial")
	public class KZKException extends Exception {

		@Override
		public String getMessage() {
			return "Die Zahl fuer den imaginaeren Anteil ist zu groﬂ!\nReeller Anteil: " + KomplexeZahlKlein2.this.re();
		}
	}
}
