package de.hsmannheim.inf.pr2.ads;

public class Tripel<E extends Comparable<E>, F extends Comparable<F>, G extends Comparable<G>> {

	protected E u;
	protected F v;
	protected G w;

	public Tripel(E u, F v, G w) {
		this.u = u;
		this.v = v;
		this.w = w;
	}
}
