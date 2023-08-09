package CollectionDemo;

import java.util.Comparator;

public class MyIntegerComparater implements Comparator<Integer> {

	@Override
	public int compare(Integer I1, Integer I2) {
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
