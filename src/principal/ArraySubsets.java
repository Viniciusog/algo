package principal;

public class ArraySubsets {
	
	public static void main(String[] args) {
		
		int myArray[] = new int[4];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i; 
		}
		
		int number = (int) Math.pow(2, myArray.length);
		for (int i = 0; i < number; i++) {
			// Se temos o número 5, então a string binária fica 101
			String binaryString = Integer.toBinaryString(i);
			// %19s faz com que a string fique com 19 caracteres no total, colocando espaços à esquerda para completar caso necessário.
			// Em seguida, fazemos o replace colocando 0's no lugar dos espaços
			String binaryStringFormatted = binaryString.format("%" + myArray.length + "s", binaryString)
					.replace(' ', '0');
			System.out.println("myString: " + binaryStringFormatted);
		}
	}
}
