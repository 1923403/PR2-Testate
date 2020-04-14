package pr2.pu1;

public class ReelleZahl extends KomplexeZahl {
    public ReelleZahl(double re) {
    	super(re, 0.0);
    }
    @Override 
    public String toString()
    {
	return Double.toString(this.re);
	}
}
