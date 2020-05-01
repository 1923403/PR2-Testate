package pr2.pu2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArtenGehege<E extends Tier> {

	/*
	 * Aufgabe 6: Wir verwenden als Collection HashSet, weil verschiedene Objekte
	 * referenziert, aber nicht doppelt gespeichert werden können und der spätere
	 * Zugriff auf diese ressourcenschonend ist.
	 */
	protected Set<E> gehege;

	public ArtenGehege() {
		this.gehege = Collections.synchronizedSet(new HashSet<>());
	}

	public void einsperren(E tier) {
		gehege.add(tier);
	}

	public static void main(String[] args) {
		var hasenstall = new ArtenGehege<Hase>();
		hasenstall.einsperren(Hase.create());
		hasenstall.einsperren(new Hase());
		hasenstall.einsperren(new Hase());

//		hasenstall.einsperren(new Tier(10));
	}
}
