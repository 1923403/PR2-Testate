package pr2.pu1;

import pr2.pu1.KomplexeZahlKlein2.KZKException;

class KomplexeZahl {
	
double re, im;
 public KomplexeZahl(double re,double im) {
	 this.re = re;
	 this.im = im;
 }
 public static void main(String[] args) throws Exception,KZKException {
	 KomplexeZahl x = new KomplexeZahl(2.5, 4.5);
	System.out.println("x ="  + x.toString());
	 KomplexeZahlKlein2 zahl1 = new KomplexeZahlKlein2(1,9); 
 }
public double re(){
		return re;
	}
public double im()
{
	return im;
	}
@Override
public String toString() {
	
	return re + " + " + im + "i";
}
private KomplexeZahl add(KomplexeZahl summand) {
	 KomplexeZahl summe = new KomplexeZahl(this.re+summand.re(), this.im+ summand.im() );
	 return summe;
}
private KomplexeZahl prod(KomplexeZahl faktor) {
	 KomplexeZahl produkt = new KomplexeZahl((this.re * faktor.re())-(this.im * faktor.im()), (this.re * faktor.re())+(this.im * faktor.im()));
	 return produkt;
}
private static KomplexeZahl add(KomplexeZahl summand1, KomplexeZahl summand2) {
	 KomplexeZahl summe = new KomplexeZahl(summand1.re+summand2.re(), summand1.im+ summand2.im() );
	 return summe;
}
private static KomplexeZahl prod(KomplexeZahl faktor1, KomplexeZahl faktor2) {
	 KomplexeZahl produkt = new KomplexeZahl((faktor1.re * faktor2.re())-(faktor1.im * faktor2.im()), (faktor1.re * faktor2.re())+(faktor1.im * faktor2.im()));
	 return produkt;
}
}
