package pr2.pu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * This is a custom iterator, which can iterate over the whole zoo.
 * 
 */
public class MyIterator implements Iterator<Tier> {

	private int pos = 0;
	private List<Tier> list = new ArrayList<>();

	/**
	 * The constructor for MyIterator.
	 * 
	 * @param map The map which belongs to the zoo to iterate over.
	 */
	public MyIterator(Map<String, ArtenGehege<? extends Tier>> map) {
		// gets all keys, gets the animals from the corresponding enclosures and puts
		// them on the list.
		for (var key : map.keySet())
			list.addAll(map.get(key).gehege);

		// sorting the list descending by hp using the custom comparator MyComparator.
		Collections.sort(this.list, new MyComparator());
	}

	// implementation of hasNext() method
	public boolean hasNext() {
		return (pos < list.size());
	}

	// implementation of next() method
	public Tier next() {
		Tier result = list.get(pos);
		pos++;
		return result;
	}
}
