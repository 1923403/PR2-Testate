package pr2.pu2;

import java.util.Iterator;

public class Zoo implements Iterable<ArtenGehege> {

	@Override
	public Iterator<ArtenGehege> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		ArtenGehege<Hase> hasenstall = new ArtenGehege<>();

		Hase hase1 = new Hase();		
		//Unterschied var zu Hase?
		Hase hase2 = new Hase();
		//var hase3 = new Hase();
		Hase.create();

		hasenstall.einsperren(hase1);
		hasenstall.einsperren(hase2);
		//hasenstall.einsperren(hase3);

		System.out.println(hasenstall.size());
		 Iterator<Hase> it = hasenstall.iterator();
		while(it.hasNext()) {
		      Hase obj = it.next();
		      System.out.println(obj.getName());
		    }

	}

}
