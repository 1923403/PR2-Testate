package pr2.pu1;

public class KomplexeZahlKlein1 extends KomplexeZahl{

	public KomplexeZahlKlein1(double re, double im) throws Exception {
		super(re, im);
		if(this.im > 10) {
					throw new Exception("Die Zahl fuer den imaginaeren Anteil ist zu groﬂ!\nReeller Anteil: " + this.re());
		}
	}
   
}
