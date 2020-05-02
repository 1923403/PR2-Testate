package pr2.pu2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * This represents a Zoo with enclosures containing animals. It is realized as a
 * HashMap called map, with enclosure names (Strings) as keys and enclosures as
 * values.
 * 
 */
class Zoo implements Iterable<Tier> {

	protected Map<String, ArtenGehege<? extends Tier>> map = new HashMap<>();

	/**
	 * This is used to iterate over a zoo.
	 * 
	 * @return Returns the custom iterator MyIterator after handing over to it the
	 *         map belonging to the zoo calling this method.
	 */
	@Override
	public Iterator<Tier> iterator() {
		return new MyIterator(map);
	}
}
