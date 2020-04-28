package pr2.pu1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	public void add() {
		KomplexeZahl k = new KomplexeZahl(1, 2);
		KomplexeZahl l = new KomplexeZahl(2, 1);
		k = k.add(l);
		assertEquals(3, k.re(), 0.01);
		assertEquals(3, k.im(), 0.01);
	}
	@Test
	public void addStatic() {
		KomplexeZahl k = new KomplexeZahl(1, 2);
		KomplexeZahl l = new KomplexeZahl(2, 1);
		k = KomplexeZahl.add(l,k);
		assertEquals(3, k.re(), 0.01);
		assertEquals(3, k.im(), 0.01);
	}
	@Test
	public void prod() {
		KomplexeZahl k = new KomplexeZahl(1, 2);
		KomplexeZahl l = new KomplexeZahl(2, 1);
		k = k.prod(l);
		assertEquals(0, k.re(), 0.01);
		assertEquals(5, k.im(), 0.01);
	}
	@Test
	public void prodStatic() {
		KomplexeZahl k = new KomplexeZahl(1, 2);
		KomplexeZahl l = new KomplexeZahl(2, 1);
		k = KomplexeZahl.prod(l,k);
		assertEquals(0, k.re(), 0.01);
		assertEquals(5, k.im(), 0.01);
	}


}
