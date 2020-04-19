package test;

import pr2.pu1.KomplexeZahlKlein2;
import pr2.pu1.KomplexeZahlKlein2.KZKException;

public class Test {

	public static void main(String[] args) {
		KomplexeZahlKlein2 kzk2;
		
		try {
			kzk2 = new KomplexeZahlKlein2(5, 12);
		} catch (KZKException kzk) {
			System.out.println(kzk.getMessage());
		}
	}
}
