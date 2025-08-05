package javaEx;

public class Variable {
	public static void main(String[] args) {
		//byte store 256 numbers: -128 to 127
		byte minNum1 = -128;
		byte maxNum1 = 127;
		//short store 65,536 numbers: -32,768 to 32,767
		short minNum2 = -32768;
		short maxNum2 = 32767;
		//Numbers positives and negatives, int store 4.294.967.296 numbers: -2147483648 to 2147483647
		int minNum = -2147483648;
		int maxNum = 2147483647;
		//long store 18.446.744.073.709.551.616 numbers: -9223372036854775808 to 9223372036854775807
		long minNum3 = -9223372036854775808L;
		long maxNum3 = 9223372036854775807L;
		long CPF = 9112483583L;
		//Numbers Broken, store 6 to 7 decimal digits
		float minNum4 = 1.101122334455667788f;
		float decimal = 10.00f;
		//double store 15 to 16 decimal digits
		double minNum5 = 10.00;
		//true or false
		boolean isTrue = true;
		boolean isFalse = false;
		//letter only
		char letter = 'a';
		//constant 
		final int age = 21;

		//words
		String name = "Bony ";
		String lastName = "Meal";
		String fullName = name + lastName;
		System.out.println("Hello World! It's working?");
		System.out.println(fullName + myNum + decimal + letter);
		System.out.println("It's is true? " + isTrue);
		int myNum;
		myNum = 9;
		System.out.println(myNum);
		//declare many variables unique line
		int x = 10, y = 5, z = 20;
		System.out.println(x + y + z);
		//one value for many variables
		int x2, y2, z2;
		x2 = y2 = z2 = 30;
		System.out.println(x2 + y2 + z2);
	}
}
