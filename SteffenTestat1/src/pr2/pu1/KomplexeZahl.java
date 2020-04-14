package pr2.pu1;
/**
 * 
 * @author Gruppe 25: Raphael (1926543), Steffen (1923403), Floris (1921233)
 *  @brief Description: This class represents <a href="https://de.wikibooks.org/wiki/Komplexe_Zahlen/_Darstellungsformen">complex numbers</a>
 *        
 *
 *        <p>
 *        This Method {@link #re()} is the getter method for the real part  
 *        </p>
 *        <p>
 *        This Method {@link #im()} is  the getter method for the imaginary part  
 * 
 *        </p>
 *        <p>
 *        This Method {@link #KomplexeZahl(double, double)} is the constructor 
 *        </P>
 *        
 **/
 
public class KomplexeZahl {

	private final double re;
	private final double im;
/**
 * 
 * @category getter
 * @return real part
 */
	public double re() {
		return this.re;
	}
	/**
	 * 
	 * @category getter
	 * @return imaginary part
	 */
	public double im() {
		return this.im;
	}
/**
 * @category constructor
 * @param realanteil
 * @param imaginaeranteil
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
 */
	@Override
	
	public String toString() {
		return this.re + " + " + this.im + "i";
	}
/**
 * This method adds two complex numbers 
 * @param kZ 
 * @return addition of two 
 */
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

	
}
