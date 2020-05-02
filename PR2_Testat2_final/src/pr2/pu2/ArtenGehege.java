package pr2.pu2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * This represents an enclosure for specific types of animals.
 * 
 * @param <E> A generic type which expects the specific type of animal to be jailed.
 */
public class ArtenGehege<E extends Tier> {

	/*
	 * Aufgabe 6: Wir verwenden als Collection HashSet, weil verschiedene Objekte
	 * referenziert, aber nicht doppelt gespeichert werden können und der spätere
	 * Zugriff auf diese ressourcenschonend ist.
	 */
	protected Set<E> gehege;

	/**
	 * This creates an enclosure realized as HashSet.
	 */
	public ArtenGehege() {
		this.gehege = Collections.synchronizedSet(new HashSet<>());
	}

	/**
	 * This jails the animal which is handed over into the enclosure.
	 * 
	 * @param tier The animal to be jailed.
	 */
	public void einsperren(E tier) {
		gehege.add(tier);
	}
}
