package pr2.pu1;

public class KomplexeZahlKlein1 extends KomplexeZahl {

	KomplexeZahlKlein1(double re, double im) throws Exception {

		super(re, im);

		if (im > 10) {
			throw new Exception("Imagin�rteil gr��er 10!Realteil war " + re); //Tutor fragen this.re() oder re?
		}

	}

	// TODO Auto-generated constructor stub
}
