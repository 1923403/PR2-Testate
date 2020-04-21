package pr2.pu1;

/**
 * 
 * @author Gruppe 25: Raphael (1926543), Steffen (1923403), Floris (1921233)
 * @brief Description: This class represents <a href=
 *        "https://de.wikibooks.org/wiki/Komplexe_Zahlen/_Darstellungsformen">complex
 *        numbers</a>
 * 
 *
 *        <p>
 *        This Method {@link #re()} is the getter method for the real part
 *        </p>
 *        <p>
 *        This Method {@link #im()} is the getter method for the imaginary part
 * 
 *        </p>
 *        <p>
 *        This Method {@link #KomplexeZahl(double, double)} is the constructor
 *        </P>
 *        <p>
 *        This Method {@link #toString()} transforms a complex number into a
 *        String
 *        </P>
 * 
 *        <p>
 *        This Method {@link #add(KomplexeZahl)} adds this number with the
 *        complex number KomplexeZahl
 *        </P>
 *        <p>
 *        This Method {@link #add(KomplexeZahl, KomplexeZahl)} adds two complex
 *        number
 *        </P>
 *        <p>
 *        This Method {@link #prod(KomplexeZahl)} multiplies this number with
 *        the complex number KomplexeZahl
 *        </P>
 *        <p>
 *        This Method {@link #add(KomplexeZahl, KomplexeZahl)} multiplies two
 *        complex number
 *        </P>
 * 
 * 
 * 
 * 
 **/

public class KomplexeZahl {

	private final double re;
	private final double im;

	/**
	 * 
	 * @return real part
	 * 
	 * @category getter
	 */
	public double re() {
		return this.re;
	}

	/**
	 * 
	 * @return imaginary part
	 * 
	 * 
	 * @category getter
	 */
	public double im() {
		return this.im;
	}

	/**
	 * 
	 * @param realanteil      : real part
	 * @param imaginaeranteil : imaganary part
	 * 
	 * @category constructor
	 */
	public KomplexeZahl(double realanteil, double imaginaeranteil) {
		this.re = realanteil;
		this.im = imaginaeranteil;
	}

	/**
	 * 
	 * @category main
	 */
	public static void main(String[] args) {
		KomplexeZahl x = new KomplexeZahl(2.5, 4.5);
		System.out.println("x = " + x);
	}

	/**
	 * @return the complex number as String
	 * 
	 * 
	 */
	@Override

	public String toString() {
		return this.re + " + " + this.im + "i";
	}

	/**
	 * This method adds this and a other complex numbers
	 * 
	 * @param summand
	 * @return sum of two complex number
	 * 
	 * @category calculation
	 */
	public KomplexeZahl add(KomplexeZahl summand) {
		return new KomplexeZahl((this.re + summand.re()), (this.im + summand.im()));
	}

	/**
	 * This method adds two complex numbers
	 * 
	 * @param summand1
	 * @param summand2
	 * @return sum of two complex numbers
	 * 
	 * @category calculation
	 */
	public static KomplexeZahl add(KomplexeZahl summand1, KomplexeZahl summand2) {
		return new KomplexeZahl((summand1.re() + summand2.re()), (summand1.im() + summand2.im()));
	}

	/**
	 * This method multiplies this and a other complex numbers
	 * 
	 * @param factor
	 * @return product of two complex numbers
	 * 
	 * @category calculation
	 */
	public KomplexeZahl prod(KomplexeZahl factor) {
		return new KomplexeZahl((this.re * factor.re() - this.im * factor.im()),
				(this.re * factor.im() + this.im * factor.re()));
	}

	/**
	 * This method multiplies two complex numbers
	 * 
	 * @param factor1
	 * @param factor2
	 * @return product of two complex number
	 * 
	 * @category calculation
	 */
	public static KomplexeZahl prod(KomplexeZahl factor1, KomplexeZahl factor2) {
		return new KomplexeZahl((factor1.re() * factor2.re() - factor1.im() * factor2.im()),
				(factor1.re() * factor2.im() + factor1.im() * factor2.re()));
	}

}
