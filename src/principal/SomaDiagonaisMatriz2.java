package principal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SomaDiagonaisMatriz2 {
	
	public static void main(String[] args) {
		
		int [][] myMatrix = {{1, 2, 3},{4, 3, 1}, {0, 5, 7}};
		
		Map<Integer, List<Integer>> map = new HashMap<>();
		
		for (int i = 0; i <= (myMatrix.length-1)*2; i++) {
			map.put(i, new ArrayList<>());
			System.out.println("-");
		}
		
		System.out.println("|");
		for (int i = 0; i < myMatrix.length; i++) { // 0 - 2
			for (int j = 0; j < myMatrix[0].length; j++) { // 0 - 2
				map.get(i + j).add(myMatrix[i][j]);
			}
		}
		
		for (int i = 0; i <= (myMatrix.length-1)*2; i++) {
			Integer[] data = map.get(i).toArray(new Integer[0]);
			Arrays.sort(data);
			map.put(i, List.of(data));
		}
		
		
			
	}
}