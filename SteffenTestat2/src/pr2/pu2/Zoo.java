package pr2.pu2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Zoo implements Iterable<Tier> {

	protected Map<String, ArtenGehege<? extends Tier>> map = new HashMap<>();

	@Override
	public Iterator<Tier> iterator() {
		return new MyIterator(map);
	}
}
