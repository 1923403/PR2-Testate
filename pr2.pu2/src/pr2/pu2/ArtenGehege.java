package pr2.pu2;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ArtenGehege<T extends Tier> {
	final static Lock lock = new ReentrantLock();

	protected TreeSet<Tier> gehege;

	public ArtenGehege() {
		this.gehege = new TreeSet<Tier>();
	}

	public void einsperren(T tier) {
		lock.lock();
		gehege.add(tier);
		System.out.println("eingesperrt  " + tier);
		lock.unlock();
	}

	public static void main(String[] args) {
		var hasenstall = new ArtenGehege<Hase>();
		var hase1 = new Hase();
		// var hase2 = new Hase();
		// var hase3 = new Hase();
//hasenstall.einsperren(hase1);
//hasenstall.einsperren(hase2);
//hasenstall.einsperren(hase3);
		hasenstall.einsperren(Hase.create());
		hasenstall.einsperren(Hase.create());
		hasenstall.einsperren(Hase.create());
		/*
		 * hasenstall.einsperren(hase1);
		 * 
		 * hasenstall.einsperren(hase2); System.out.println(hasenstall.gehege.size());
		 * 
		 * hasenstall.einsperren(hase3);
		 */
		// var tier1 = new Tier(50);
		// hasenstall.einsperren(tier1);
		System.out.println(hasenstall.gehege.size());

		Iterator<Tier> it = hasenstall.gehege.iterator();
		lock.lock();
		while (it.hasNext()) {

			System.out.println(it.next() + "befindet sich im Gehege");
		}
		lock.unlock();
	}

}
