package de.hsmannheim.inf.pr2.ads;

public class Tripel<U extends Comparable<U>, V extends Comparable<V>, W extends Comparable<W>> {

	protected U u;
	protected V v;
	protected W w;

	public Tripel(U u, V v, W w) {
		this.u = u;
		this.v = v;
		this.w = w;
	}
	public String toString(){
		
		return (u.toString()+v.toString()+w.toString());
		
	}

}
