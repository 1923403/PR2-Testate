package pr2.pu2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MyIterator implements Iterator<Tier> {

	private int pos = 0;
	private List<Tier> list = new ArrayList<>();
	private Map<String, ArtenGehege<Tier>> map;

	public MyIterator(Map<String, ArtenGehege<Tier>> map) {
		this.map = map;
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
