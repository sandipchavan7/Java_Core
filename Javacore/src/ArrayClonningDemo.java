import java.util.Arrays;
public class ArrayClonningDemo {
	public static void main(String[] args) {
		int[] arr1 = {44,55,66,77,88,99};
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		int[] copy1 = arr1.clone();
		System.out.println(Arrays.toString(copy1));
		
		System.out.println(arr1 == copy1);
		
		
		
		
	}

}
