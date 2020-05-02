package pr2.pu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MyIterator implements Iterator<Tier> {

	private int pos = 0;
	private List<Tier> list = new ArrayList<>();

	public MyIterator(Map<String, ArtenGehege<? extends Tier>> map) {
		for (var key : map.keySet())
			list.addAll(map.get(key).gehege);

		Collections.sort(this.list, new MyComparator());
	}

	public boolean hasNext() {
		return (pos < list.size());
	}

	public Tier next() {
		Tier result = list.get(pos);
		pos++;
		return result;
	}
}
