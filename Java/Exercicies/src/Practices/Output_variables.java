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
		float q18Num1 = 17.18f;
		System.out.println("Float value: " + q18Num1);
		
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
		String q28Name = "Bony";
		byte q28Age = 21;
		double q28Height = 1.71;
		System.out.println("Name: " + q28Name + " Age: " + q28Age + " Height: " + q28Height);
		
		//#29 Use final for a constant PI and print
		final double q29PI = 3.14;
		System.out.println(q29PI);
		
		//#30 Calc and print area of square 
		int q30Num1 = 10, q30Num2 = 20, q30Area = q30Num1 * q30Num2;
		System.out.println("Area Square: " + q30Area);
		
		//#31 Create a variable long and print
		long q31Num1 = 1223232323232112L;
		System.out.println("Long: " + q31Num1);
		
		//#32 Use byte, short, int, long and print all
		byte q32Num1 = 23;
		short q32Num2 = 230;
		int q32Num3 = 1020023;
		long q32Num4 = 1010010101230230010l;
		System.out.println("Byte: " + q32Num1 + "Short: " + q32Num2 + "Int: " + q32Num3 + "Long: " + q32Num4);
		
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
		int q37Num1 = 12;
		double q37Num2 = q37Num1;
		System.out.println("Int for Decimal: " + q37Num2);
		
		//#38 Show difference between int and double in the division
		int q38Num1 = 10;
		double q38Num2 = 20.50;
		System.out.println("=============== Question 38 ===============");
		System.out.println("Int difference: " + (q38Num1 / 2) + " Double difference: " + (q38Num2 / 2) + " Both: " + (q38Num2 / q38Num1));
		
		//#39 Store a negative number and print
		int q39Num1 = -1;
		System.out.println("Negative Number: " + q39Num1);
		
		//#40 Make a account with 4 operator and print
		int q40Num1 = 10 + 10 - 10 / 10 * 10;
		System.out.println(q40Num1);
		
		//#41 Make a calc simple (sum, sub)
		int q41Number1, q41Number2, q41Sum, q41Sub;
		q41Number1 = 10;
		q41Number2 = 15;
		q41Sum = q41Number1 + q41Number2;
		q41Sub = q41Number1 - q41Number2;
		System.out.println("Number: " + q41Number1 + " Number 2: " + q41Number2 + " Sum: " + q41Sum + " Sub: " + q41Sub);
		
		//#42 Make a calc IMC with (weight / (height²)
		double q42Weight, q42Height, q42IMC;
		q42Weight = 50.00;
		q42Height = 1.71;
		q42IMC = q42Weight / (q42Height * q42Height);
		System.out.println("Your weight is: " + q42Weight + ", and your height is: " + q42Height + ", IMC: " + q42IMC);
		
		//#43 Calc the triangle area
		int q43Base, q43Height, q43TriangleArea;
		q43Base = 10;
		q43Height = 15;
		q43TriangleArea = (q43Base * q43Height) / 2;
		System.out.println("Triangle Area: " + q43TriangleArea);
		
		//#44 Calc monthly salary with hours and value per hour
		int q44Salary, q44Hours, q44Weekly, q44Value;
		q44Salary = 1518;
		q44Hours = 8;
		q44Weekly = 40;
		q44Value = (q44Salary / (((q44Weekly / q44Hours) * 4) * q44Hours)); 
		System.out.println(q44Value);
		
		//#45 Calc time travel with velocity and distance
		double q45TimeTravel, q45Distance, q45Velocity;
		q45Distance = 90.0;
		q45Velocity = 90.0;
		q45TimeTravel = q45Distance / q45Velocity;
		System.out.println(q45TimeTravel);
		
		//#46 Make a "Business Card" with several variables
		String q46Line = "====================";
		String q46Name = "  Samuel R. Araujo  ";
		String q46Contact = "  (82) 99990-9719  ";
		String q46Endress = "R. Santos Ferraz, 567";
		System.out.println(q46Line);
		System.out.println(q46Name);
		System.out.println(q46Contact);
		System.out.println(q46Endress);
		System.out.println(q46Line);
		
		//#47 Make a variable to CPF, Phone, Name and Age
		int q47Phone, q47Age, q47CPF;
		String q47Name;
		q47Phone = 999909719;
		q47Age = 21;
		q47CPF = 12483583;
		q47Name = "Samuel Rodrigo Araujo de Carvalho";
		System.out.println("Phone: " + q47Phone + " Age: " + q47Age + " CPF: " + q47CPF + " Name: " + q47Name);
		
		//#48 Make a temp conversion Celsius to Fahrenheit
		int q48Celsius, q48Fahrenheit;
		q48Celsius = 10;
		q48Fahrenheit = (q48Celsius * 9/5) + 32;
		System.out.println("Celsius: " + q48Celsius + " Fahrenheit: " + q48Fahrenheit);
		
		//#49 Calc percentage: 30% of 200
		double q49Percentage, q49Number, q49Result;
		q49Percentage = 87;
		q49Number = 256;
		q49Result = q49Number * q49Percentage/100;
		System.out.println(q49Result);
		
		//#50 Verify if a variable is par or impar (using /)
		//#51 Invert both values two variables without a assistant variable
		//#52 Invert using a assistant variable
		//#53 Store a big number with BigInteger (Advanced)
		//#54 Declare a variable in Scientific Notation with double
		//#55 Store time in seconds and convert to hours, minutes and seconds
		//#56 Calc a difference age between two people
		//#57 Calc a media speed with form
		//#58 Make a program print 3 values reads of keyword
		//#59 sum three double and print with 2 decimals places
		//#60 print a concatenation numbers with text using + and printf
		//#61 Use printf to print a number format
		//#62 Make a receipt with System.out.printf aligned
		//#63 Store a special character with char and print
		//#64 Print a character with value ASCII
		//#65 Calc total value of a purchase at a discount
		//#66 Simulate final value with simply fees
		//#67 Simulate final value with compounds fees
		//#68 Calc the perimeter of a circle (2 * PI * r)
		//#69 Convert a decimal number for binary (with Integer.toBinaryString)
		//#70 Declare various variables with a line
		//#71 Make accounts with casting: (int) (double)
		//#72 Demonstrate what happens with division per zero with int vs double
		//#73 Use operators ++ and -- with variables
		//#74 Make variables with names meanings and well written
		//#75 Simulate a store cashier: Product, qtd, price, total
		//#76 Make a bulletin with notes and medias
		//#77 Calc a change of a buy
		//#78 Receive entry value (scanner) and show
		//#70 Calc percentage increase salary
		//#80 Calc difference between two schedules with minutes
		//#81 Use Scanner to read name, age and city
		//#82 Make a "register token" with various entry and prints
		//#83 Use Math.pow to exponentiation
		//#84 Use Math.sqrt to 
	}
}
