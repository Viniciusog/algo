package principal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SomaDiagonaisMatriz {
	public static void main(String[] args) {
		
		int matrix[][] = {{8,3,4,1,5},{9,7,3,0,6},{4,2,2,5,7},{5,7,8,3,8},{6,8,4,2,9}};
		
		int lines = matrix.length;
		int columns = matrix[0].length;
		
		for (int j = 0; j < columns; j++) {
			int currentLine = 0;
			int array[] = new int[j+1];
			int index = 0;
			
			int cont = j; // Serve para saber qual coluna do elemento que estamos pegando
			while (cont >= 0) {
				array[index] = matrix[currentLine++][cont];
				index++;
				cont--;
			}
			
			Arrays.sort(array);
			
			int auxColumn = j;
			for (int i = 0; i < array.length; i++) {
				matrix[i][auxColumn] = array[auxColumn];
				auxColumn--;
			}			
		}
		
		if (columns > 1) {
			for (int i = 1; i < columns; i++) {
				int array[] = new int[columns - i];
				int index = 0;
				int line = lines - 1;
				
				int cont = i;
				
				while (cont < columns) {
					System.out.print(" cont="+cont + " ");
					System.out.print(" line="+line);
					array[index] = matrix[line][cont];
					System.out.print(" arraynapos="+array[index]);
					line--;
					cont++;
					index++;
				}
				
				Arrays.sort(array);	
				
				for (int k = 0; k < array.length; k++) {
					System.out.print(" " + array[k]);
				}
				System.out.println(" ");
				
				int lineAux = lines - 1;
				int columnAux = i;
				for (int j = 0; j < array.length; j++) {
					matrix[lineAux][columnAux] = array[j];
					lineAux--;
					columnAux++;
				}
			}
		}
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println("");
		}
	}
}