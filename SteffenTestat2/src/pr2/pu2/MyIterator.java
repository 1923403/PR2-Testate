package pr2.pu2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MyIterator<E extends Tier> implements Iterator<E> {

	private int pos = 0;
	private List<E> list = new ArrayList<>();

	public MyIterator(Map<String, ArtenGehege<E>> map) {
		for (String key : map.keySet()) {
			list.addAll(map.get(key).gehege);
		}
	}

	public boolean hasNext() {
		return (pos < list.size());
	}

	public E next() {
		E result = list.get(pos);
		pos++;
		return result;
	}
}
