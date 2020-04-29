package pr2.pu2;

import java.util.ArrayList;

public class ArtenGehege<E extends Tier> {

	protected ArrayList<E> gehege;
	
	public ArtenGehege() {
		this.gehege = new ArrayList<>();
	}

	public void einsperren(E tier) {
		gehege.add(tier);
	}

	public static void main(String[] args) {
		var hasenstall = new ArtenGehege<Hase>();
		var hase1 = new Hase();
		var hase2 = new Hase();
		var hase3 = new Hase();

		hasenstall.einsperren(hase1);
		hasenstall.einsperren(hase2);
		hasenstall.einsperren(hase3);

//		var tier1 = new Tier(50);
//		hasenstall.einsperren(tier1);

		for (var i : hasenstall.gehege) {
			System.out.println(i);
		}
	}
}
