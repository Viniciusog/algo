package ArraySubsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://gist.github.com/syphh/085a9cd972fdd8704e9fdfc3f6c2694a
public class RecursiveWay {
	
	public static void rec(Integer arr[], int i, List<Integer> subset, List<List<Integer>> subsets) {
		if (i == arr.length) {
			subsets.add(List.copyOf(subset));
			return;
		}
		// Não podemos passar List.copyOf() como parâmetro, pois é imutável.
		// A forma de resolver é passando como new ArrayList
		rec(arr, i+1, new ArrayList<>(subset), subsets);
		subset.add(arr[i]);
		rec(arr, i+1, new ArrayList<>(subset), subsets);		
	}
	
	public static void recWrapper(int arr[]) {
		Integer myIntegerArray[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		List<List<Integer>> subsets = new ArrayList<>();
		List<Integer> subset = new ArrayList<>();
		rec(myIntegerArray, 0, subset, subsets);
		//rec(myIntegerArray, 0, subset, subsets);
		/*teste(subset, subsets);
		System.out.println("Subset");
		subset.forEach(System.out::print);*/
		
		System.out.println("Subsets: ");
		System.out.println(subsets);
		/*int i = 0;
		subsets.forEach(sub -> {
			System.out.println("i: " + i);
			sub.forEach((e) -> {
				System.out.print(e + " ");
			});
		});*/
	}
	
	public static void main(String[] args) {
		int myArray[] = new int[4];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (i+1);
			System.out.print(myArray[i] + " ");
		}
		System.out.println("");
		
		recWrapper(myArray);
	}

}
