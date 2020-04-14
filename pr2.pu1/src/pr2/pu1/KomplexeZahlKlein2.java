package pr2.pu1;

public class KomplexeZahlKlein2 extends KomplexeZahl {

	public KomplexeZahlKlein2(double realanteil, double imaginaeranteil) throws KZKException {
		
		super(realanteil, imaginaeranteil);
		if(imaginaeranteil> 10) {
			throw new KZKException(realanteil);
		}
		
	
		}
	
		@SuppressWarnings("serial")
		public class KZKException extends Exception {
		
	

		public KZKException(double re) {
			System.out.println("Der imaginäre Teil ist zu hoch der reelle Anteil hat den Wert von "  + re);
		}
}
		}