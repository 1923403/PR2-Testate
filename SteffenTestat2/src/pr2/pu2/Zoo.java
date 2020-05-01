package pr2.pu2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Zoo implements Iterable<Tier> {

	protected Map<String, ArtenGehege<? extends Tier>> map = new HashMap<>();

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Iterator<Tier> iterator() {
		return new MyIterator(map);
	}

	public static void main(String[] args) {
		var zoo = new Zoo();

		var hasenstall = new ArtenGehege<Hase>();
		var hase1 = new Hase();
		var hase2 = new Hase();

		hasenstall.einsperren(hase1);
		hasenstall.einsperren(hase2);

		var tierstall = new ArtenGehege<Tier>();
		var tier1 = new Tier(35);
		var tier2 = new Tier(16);
		var tier3 = new Tier(64);

		tierstall.einsperren(tier1);
		tierstall.einsperren(tier2);
		tierstall.einsperren(tier3);

		zoo.map.put("Hasenstall", hasenstall);
		zoo.map.put("Tierstall", tierstall);

		var iterator = zoo.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next().health);
	}
}
