package Practices;

public class Output_variables {
	public static void main(String[] args) {
		//#1 Print full name
		String Fullname = "Bony Meal";
		System.out.println(Fullname);
		
		//#2 Declare variable int and value
		int age = 21;
		System.out.println(age);
		
		//#3 Declare variable String call City and print "I'm live in X"
		String city = "New York";
		System.out.println("I'm live in " + city);
		
		//#4 Create two variables int with values, sum and print
		int num1 = 10, num2 = 15;
		System.out.println(num1 + num2);
		
		//#5 Create variable double with a number decimal and print
		double q5Num = 10.00f;
		System.out.println(q5Num);
		
		//#6 Declare boolean variable and print value
		boolean isTrueQ6 = true;
		System.out.println("Question 6? " + isTrueQ6);
		
		//#7 Charge value two variables and print before e later
		int q7Num1 = 10, q7Num2 = 15;
		System.out.println("Number: " + q7Num1 + "Number 2: " + q7Num2);
		q7Num1 = q7Num2 = 20;
		System.out.println("Number 1: " + q7Num1 + "Number 2: " + q7Num2);
		
		//#8 Print "The student Jon he has 20 years", using variables
		String q8Name = "Jon";
		int q8Age = 20;
		String q8Setence1 = "The student ";
		String q8Setence2 = " he has ";
		String q8Setence3 = " years";
		System.out.println(q8Setence1 + q8Name + q8Setence2 + q8Age + q8Setence3);
		
		//#9 print the result multiply two numbers
		int q9Num1, q9Num2;
		q9Num1 = 10;
		q9Num2 = 15;
		int q9Multi = q9Num1 * q9Num2;
		System.out.println("A soma da multiplicação de " + q9Num1 + " com " + q9Num2 + " é " + q9Multi);
		
		//#10 Create three variables int e print media aritmet
		int q10num1 = 10, q10num2 = 15, q10num3 = 20;
		int q10media = q10num1 + q10num2 + q10num3 / 3;
		System.out.println("Media numbers is: " + q10media);
		
		//#11 Print your Name, Age and City in three lines differents
		String q11Name = "Bony", q11Age = "21", q11City = "New York";
		System.out.println("My names is " + q11Name + ", i have " + q11Age + " years and lived in " + q11City);
		System.out.println("Name: " + q11Name);
		System.out.println("Age: " + q11Age);
		System.out.println("City: " + q11City);
		
		//#12 Print variables in one line with +
		String q12Phase = "This phase is";
		String q12Phase2 = " very important.";
		System.out.println(q12Phase + q12Phase);
		
		//#13 Create a variable char and print
		char q12Letter = 'C';
		System.out.println("Letter is: " + q12Letter);
		
		//#14 Declare double pi = 3.1415 and print with text
		double q14PI = 3.1415;
		System.out.println("Value PI: " + q14PI);
		
		//#15 Declare int days = 365 and print "A year there is 365 days"
		int q15Days = 365;
		System.out.println("A year there is " + q15Days + " days");
		
		//#16 Create a variable with funny name and print
		String q16FunnyName = "Joe Ass";
		System.out.println(q16FunnyName);
		
		//#17 Concatenate a String and number
		String q17Phase1 = "Age: ";
		int q17Num1 = 21;
		System.out.println(q17Phase1 + q17Num1);
		
		//#18 Create a variable float and print
		
		//#19 Declare two variables boolean and print both
		boolean q19IsTrue = true, q19IsFalse = false;
		System.out.println("It's true: " + q19IsFalse + "it's false: " + q19IsTrue);
		
		//#20 Print a phase using variables in multi lines
		String q20Phase1 = "World's digger big shoe", q20Phase2 = "Gold is Good at God";
		System.out.println(q20Phase1);
		System.out.println(q20Phase2);
		
		//#21 Print a multiplication table of 1 number
		int q21Number = 3;
		System.out.println("Multiplication Table: " + q21Number);
		System.out.println("1 X " + q21Number + " = " + (q21Number*1));
		System.out.println("2 X " + q21Number + " = " + (q21Number*2));
		System.out.println("3 X " + q21Number + " = " + (q21Number*3));
		System.out.println("4 X " + q21Number + " = " + (q21Number*4));
		System.out.println("5 X " + q21Number + " = " + (q21Number*5));
		System.out.println("6 X " + q21Number + " = " + (q21Number*6));
		System.out.println("7 X " + q21Number + " = " + (q21Number*7));
		System.out.println("8 X " + q21Number + " = " + (q21Number*8));
		System.out.println("9 X " + q21Number + " = " + (q21Number*9));
		System.out.println("10 X " + q21Number + " = " + (q21Number*10));
		
		//#22 Create a Phase with quotation marks inside
		String q22Phase = "This phase with 'quotation'";
		System.out.println(q22Phase);
		
		//#23 Use \n, \t and \\ in a out
		
		//#24 Convert a number in string and print
		
		//#25 Convert string for int with integer.parseint
		
		//#26 Calc age from birthday
		int q26Birthday = 2004, q26Year = 2025;
		System.out.println("You are " + (q26Year - q26Birthday) + " years");
		
		//#27 Declare height and weight and print
		double q27Height = 1.71, q27Weight = 50.5;
		System.out.println("Height: " + q27Height + "m Weight: " + q27Weight + "kg");
		
		//#28 Use name, age and height for print a resume
		
		//#29 Use final for a constant PI and print
		final double q29PI = 3.14;
		System.out.println(q29PI);
		
		//#30 Calc and print area of square 
		int q30Num1 = 10, q30Num2 = 20, q30Area = q30Num1 * q30Num2;
		System.out.println("Area Square: " + q30Area);
		
		//#31 Create a variable long and print
		
		//#32 Use byte, short, int, long and print all
		
		//#33 Print two variables in line with comma
		
		//#34 Make an account  with priority using parentheses 
		int q34Num1 = (5 / 5) + 10 - (10-5);
		System.out.println(q34Num1);
		
		//#35 Calc a double numbers
		double q35Num1 = 10.5 + 11.5;
		System.out.println(q35Num1);
		
		//#36 Calc square of number 
		double q36SquareNumber = 10.0;
		System.out.println("Square Number " + q36SquareNumber + " = " + (q36SquareNumber * q36SquareNumber));
		
		//#37 Convert a number int for decimal
		
		//#38 Show difference between int and double in the division
		
		//#39 Store a negative number and print
		int q39Num1 = -1;
		System.out.println("Negative Number: " + q39Num1);
		
		//#40 Make a account with 4 operator and print
		int q40Num1 = 10 + 10 - 10 / 10 * 10;
		System.out.println(q40Num1);
		
	}
}
