
	package pr2.pu2;

	import java.util.ArrayList;
import java.util.Iterator;

	public class ArtenGehege<E extends Tier> {

		protected ArrayList<E> gehege;

		public ArtenGehege() {
			this.gehege = new ArrayList<>();
		}

		public void einsperren(E tier) {
			gehege.add(tier);
		}

/*		public static void main(String[] args) {
			var hasenstall = new ArtenGehege<Hase>();
			var hase1 = new Hase();
			var hase2 = new Hase();
			var hase3 = new Hase();

			hasenstall.einsperren(hase1);
			hasenstall.einsperren(hase2);
			hasenstall.einsperren(hase3);

			var tier1 = new Tier(50);
			hasenstall.einsperren(tier1);

		System.out.println(hasenstall.gehege.size());

		
		}*/
		
		public int getSize(ArtenGehege artGehege) {
			return artGehege.gehege.size();
		} 
		
		public Tier getAnimal(int stelle){
			
		return	(Tier) this.gehege.get(stelle);
	
	
		}
}
