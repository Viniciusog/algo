package principal;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
	
	public static void plusMinus(List<Integer> arr) {
	   int pos=0, zero=0, neg=0;
	   
	   for (int element : arr) {
		   if (element == 0) {
			   zero++;
		   } else if (element > 0) {
			   pos++;
		   } else {
			   neg++;
		   }
	   }
	   
	   double zr = (double)zero/arr.size();
	   double pr = (double)pos/arr.size();
	   double nr = (double)neg/arr.size();
	   
	   
	   System.out.printf("%.6f\n", pr);
	   System.out.printf("%.6f\n", nr);
	   System.out.printf("%.6f", zr);
	   
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(-4, 3, -9, 0, 4, 1);
		plusMinus(list);
		
	}
}