package pr2.pu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComperatorAlter implements Comparator<Tier> {
 
 public static void main(String[] args) {
	 
}
@Override
public int compare(Tier a, Tier b) {
return b.getHealth()-a.getHealth();

    }

	
}
