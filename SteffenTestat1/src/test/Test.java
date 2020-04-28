package test;

import pr2.pu1.KomplexeZahl;
import pr2.pu1.KomplexeZahlKlein1;
import pr2.pu1.KomplexeZahlKlein2;
import pr2.pu1.KomplexeZahlKlein2.KZKException;

public class Test {

	public static void main(String[] args) {


		KomplexeZahlKlein1 kzk1;

		try {
			kzk1 = new KomplexeZahlKlein1(5, 12);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
