package pr2.pu2;



import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class Zoo implements Iterable<Tier> {
static Map<String , ArtenGehege<? extends Tier>>  zooMap = new TreeMap<>();  
    
	@Override
	public Iterator<Tier> iterator() {
		
		String[] gehegeNamen =  zooMap.keySet().toArray(new String[zooMap.size()]);
		int zeiger = 0;
		int max = gehegeNamen.length-1;
		return new Iterator<Tier>() {

			@Override
			public boolean hasNext() {
    if (zeiger< max ) {
    	return true;
    }
    else {	return false;}
    }

			@Override
			public Tier next() {
		  int stelle = 0;
		  ArtenGehege artGehege = 	zooMap.get(gehegeNamen[zeiger]);
		  stelle++;
		  return artGehege.getAnimal(stelle);
				
			}
			

		};
		
	}

	public static void main(String[] args) {
		var hasenstall = new ArtenGehege<Hase>();
		var hase1 = new Hase();
		var hase2 = new Hase();
		var hase3 = new Hase();

		hasenstall.einsperren(hase1);
		hasenstall.einsperren(hase2);
		hasenstall.einsperren(hase3);
		zooMap.put("hasenstall", hasenstall);
   Zoo zoo = new Zoo();
		Iterator<Tier> it =    zoo.iterator();
			
	    	   
		System.out.println( it.next());
		}
}