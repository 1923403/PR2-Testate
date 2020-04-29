package pr2.pu2;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class ArtenGehege<T extends Tier > {
  protected  TreeSet<Tier> gehege;
public ArtenGehege() {
 this.gehege = new TreeSet<Tier>();
}
public void einsperren(T tier) {
	gehege.add(tier);
	System.out.println("eingesperrt  "+tier.getName());
}
	public static void main(String[] args) {
		var hasenstall = new ArtenGehege<Hase>();
		Hase hase1 = new Hase();
		System.out.println(hase1);
		var hase2 = new Hase();
		var hase3 = new Hase();
		

		hasenstall.einsperren(hase1);
		hasenstall.einsperren(hase2);
		hasenstall.einsperren(hase3);
		
		Iterator<Tier> itr = hasenstall.gehege.iterator();
	while( itr.hasNext())	
	System.out.println(itr.next());

	}

}
