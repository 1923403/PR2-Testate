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
}
