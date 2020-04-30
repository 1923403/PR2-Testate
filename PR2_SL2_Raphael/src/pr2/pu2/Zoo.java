package pr2.pu2;

import java.util.Iterator;


public class Zoo implements Iterable<Tier> {

	

	public static void main(String[] args) {
		ArtenGehege<Hase> hasenstall = new ArtenGehege<>();

		var hase1 = new Hase();
		//Unterschied var zu Hase?
		Hase hase2 = new Hase();
		Hase hase3 = new Hase();
		

		hasenstall.einsperren(hase1);
		hasenstall.einsperren(hase2);
		//hasenstall.einsperren(hase3);

		System.out.println(hasenstall.size());
		
		 Iterator<Hase> it = hasenstall.iterator();
		while(it.hasNext()) {
		      Hase obj = it.next();
		      System.out.println(obj.hp);
		    }

	}

	@Override
	public Iterator<Tier> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
