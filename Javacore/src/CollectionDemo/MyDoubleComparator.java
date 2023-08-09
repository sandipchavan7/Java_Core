package CollectionDemo;

import java.util.Comparator;

public class MyDoubleComparator implements Comparator<Double>{

	@Override
	public int compare(Double I1, Double I2) {
		if(I1>I2) {
			return -1;
		 }
			else if(I1<I2) {
				return 1;
				
			}
			else {
				return 0;
			}
	}

	

}
