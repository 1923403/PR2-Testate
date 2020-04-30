package pr2.pu2;

import java.util.ArrayList;

public class ArtenGehege<E extends Tier> extends ArrayList<E> {

	private static final long serialVersionUID = 1L;

	public void einsperren(E x) {
		this.add(x);
	}
}
