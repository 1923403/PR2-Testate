package pr2.pu1;

public class imTeilZuHochException extends Exception {
		public imTeilZuHochException(double re) {
		System.out.println("Der imaginäre Teil ist zu hoch der reelle Anteil hat den Wert von "  + re);
	}
}
