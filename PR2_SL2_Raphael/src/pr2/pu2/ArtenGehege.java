package pr2.pu2;

import java.util.ArrayList;

public class ArtenGehege<E> extends ArrayList<E> {

	public void einsperren(E x) {
		this.add(x);
	}

	public static void main(String[] args) {

		ArtenGehege<Hase> hasenstall = new ArtenGehege<>();

		Hase hase1 = new Hase();
		
		//Unterschied var zu Hase?
		Hase hase2 = new Hase();
		var hase3 = new Hase();

		hasenstall.einsperren(hase1);
		hasenstall.einsperren(hase2);
		hasenstall.einsperren(hase3);

		System.out.println(hasenstall.size());

	}

}
