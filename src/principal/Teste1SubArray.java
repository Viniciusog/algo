package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste1SubArray {
	
	public static List<Integer> subsetA(List<Integer> arrList) {
		System.out.println("----");
		arrList.forEach(el -> System.out.print(el + ","));
		System.out.println("\n----");
		
		int arr[] = new int[arrList.size()];
		for (int i = 0; i < arrList.size(); i++) {
			arr[i] = arrList.get(i).intValue();
		}
		
		// O (nlogn)
		Arrays.sort(arr); 
		
		// Aqui temos um array com as somas
		// O(n)
		int arrAux[] = new int[arr.length];
		arrAux[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arrAux[i] = arrAux[i - 1] + arr[i];
		}
		
		int resultIndex = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			// faz a soma da posição i até o fim do arr
			int subSoma = 0;
			for (int j = i; j < arr.length; j++) {
				subSoma += arr[j];
			}
			
			if (subSoma > arrAux[i - 1]) {
				resultIndex = i;
				break;
			}
		}
		
		/*while (arr[resultIndex] == arr[resultIndex - 1] && resultIndex > 0) {
			resultIndex--;
		}*/
		
		List<Integer> resultList = new ArrayList<>();
		//int qntElements = arr.length - resultIndex;
		for (int i = resultIndex; i < arr.length; i++) {
			resultList.add(arr[i]);
		}
		
		System.out.println("----");
		resultList.forEach(System.out::println);
		System.out.println("----");
		
		return resultList;
    }
	
	public static void main(String[] args) {

		//int arr[] = {4,2,5,1,6};
		int arr[] = {1,2,4,5,7,8,9,9,9,25};
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		
		System.out.println(subsetA(list));
		
	}
}