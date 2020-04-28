package pr2.pu1;

/**
 * This is a subclass from {@link KomplexeZahl}
 * 
 *
 */
public class KomplexeZahlKlein1 extends KomplexeZahl {
	/**
	 * 
	 * @param realanteil      : real part
<<<<<<< HEAD
	 * @param imaginaeranteil : imaginary part
	 * @throws Exception if imaginary part > 10
=======
	 * @param imaginaeranteil : imaganary part
	 * @throws Exception if imaganary part > 10
>>>>>>> branch 'master' of https://github.com/JohnDoe2209/PR2-Testate.git
	 * 
	 * @category constructor
	 */
	public KomplexeZahlKlein1(double realanteil, double imaginaeranteil) throws Exception {
		super(realanteil, imaginaeranteil);

		if (this.im() > 10) {
			throw new Exception("Die Zahl fuer den imaginaeren Anteil ist zu groﬂ!\nReeller Anteil: " + this.re());
		}
	}
}
