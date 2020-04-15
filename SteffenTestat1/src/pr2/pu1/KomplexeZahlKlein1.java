package pr2.pu1;
/**
 * This is a subclass from {@link KomplexeZahl}
 * 
 *
 */
public class KomplexeZahlKlein1 extends KomplexeZahl {
/**
 * 
 * @param realanteil : real part
 * @param imaginaeranteil : imaganary part
 * @throws Exception if imaganary part > 10
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
