package pr2.pu1;
/**
 * 
 * <p>This is a subclass from {@link KomplexeZahl}</p>
 * <p>And represent real numbers. And can transform them into a {@link #ReelleZahl.toString() String}</p>
 * <p>A real number is a complex number with a imaginary part = 0</p>
 */
public class ReelleZahl extends KomplexeZahl {
/**
 * 
 * @param realanteil : real part
 * 
 * @category constructor
 */
	public ReelleZahl(double realanteil) {
		super(realanteil, 0.0);
	}
	/**
	 * @return  real number as String
	 */
	@Override
	
	public String toString() {
		return String.valueOf(this.re());
	}
}
