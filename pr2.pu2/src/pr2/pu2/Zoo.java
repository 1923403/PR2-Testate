package pr2.pu2;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;



public class Zoo implements Iterable<Tier> {
static Map<String , ArtenGehege<? extends Tier>>  zooMap = new HashMap<>();

    
	@Override
	public Iterator<Tier> iterator() {
		
		String[] gehegeNamen =  zooMap.keySet().toArray(new String[zooMap.size()]);
		
		return new Iterator<Tier>() {
			int gehegeZeiger = 0;
			int tierZeiger = -1;
			int max = gehegeNamen.length-1;
			ArtenGehege artGehege = 	zooMap.get(gehegeNamen[gehegeZeiger]);
			@Override
			public boolean hasNext() {
				
				  if(tierZeiger < artGehege.getSize(artGehege)-1) {
			 
				  return true;
				  } else if (tierZeiger>=artGehege.getSize(artGehege)-1 && gehegeZeiger < max ) {
					 
					  return true;
				  }
    else {	return false;}
    }

			@Override
			public Tier next() {
		  
		if(hasNext()) {
			  if(tierZeiger < artGehege.getSize(artGehege)-1) {
				  tierZeiger++ ;
				
				  } else if (tierZeiger>=artGehege.getSize(artGehege)-1 && gehegeZeiger < max ) {
					  tierZeiger = 0;
					  gehegeZeiger++;
					  artGehege = zooMap.get(gehegeNamen[gehegeZeiger]);
				  }
		  return artGehege.getAnimal(tierZeiger);
				
			}
			else {
				System.out.println("Das waren alle Tiere im Zoo");
				 throw new NoSuchElementException();}
			}
		};
		
	}

	public static void main(String[] args) {
		Comparator<Tier> comp = new ComperatorAlter();
		List<Tier> list = new ArrayList<Tier>();
		var hasenstall = new ArtenGehege<Hase>();
		var hase1 = new Hase();
		var hase2 = new Hase();
		var hase3 = new Hase();

		hasenstall.einsperren(hase1);
		hasenstall.einsperren(hase2);
		hasenstall.einsperren(hase3);
		
		
		var tierstall = new ArtenGehege<Tier>();
		var tier1 = new Tier(35);
		var tier2 = new Tier(16);
		var tier3 = new Tier(64);

		tierstall.einsperren(tier1);
		tierstall.einsperren(tier2);
		tierstall.einsperren(tier3);
		zooMap.put("hasenstall", hasenstall);
		zooMap.put("tierstall", tierstall);
   Zoo zoo = new Zoo();
   		
   Iterator<Tier> it =    zoo.iterator();
			
	    	while(it.hasNext()) {   
		     list.add(it.next());
	    	}
	    	Collections.sort(list, comp);
	      for(int a = 0; a<list.size(); a++) {
	    	  System.out.println(list.get(a).getHealth());
	      }
		}
}