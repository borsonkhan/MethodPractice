package methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodPractice {

	public static void main(String[] args) {

		System.out.println("Q1 = " + getText("khan"));
		System.out.println("Q2 = " + getSubject("Khan"));
		System.out.println("Q3 = " + getUpperText("Khan"));
		System.out.println("Q4 = " + getEvenNumber(20));
		System.out.println("Q5 = " + getOddNumber(20));
		System.out.println("Q6 = " + getKilometer(5));
		System.out.println("Q7 = " + getIndex("borson"));
		System.out.println("Q8 = " + getcharList("borson"));
		System.out.println("Q9 = " + getSum(10));
		System.out.println("Q10 = " + getSquare(10));
		System.out.println("Q11 = " + Arrays.toString(getEvenList(10)));
		System.out.println("Q12 = " + Arrays.toString(getOddList(10)));
		System.out.println("Q13 = " + getTextList(18));
		System.out.println("Q14 = " + getComments(15));

	}

	/*
	 * Que 1 ; input = String name; return = String; serving bucket = variable;
	 */

	public static String getText(String name) {
		String text = " ";

		text = name;

		return text;
	}

	/*
	 * Q2; input = String name; return = String ; serving bucket = variable;
	 */

	public static String getSubject(String name) {
		String subject = " ";

		subject = name.toLowerCase();

		return subject;
	}

	/**
	 * Q3; input = String name; return type = String; serving bucket = variable;
	 */

	public static String getUpperText(String name) {
		String upperText = " ";

		upperText = name.toUpperCase();

		return upperText;
	}

	/*
	 * Q4; input = int number; return type = ArrayList<Integer>; serving bucket =
	 * list;
	 */
	public static ArrayList<Integer> getEvenNumber(int number) {
		ArrayList<Integer> evenNumber = new ArrayList<Integer>();

		for (int i = 0; i <= 20; i++) {

			if (i % 2 == 0) {

				evenNumber.add(i);
			}
		}

		return evenNumber;
	}

	/*
	 * Q5; input = int number; return type = ArrayList<Integer>; serving bucket =
	 * list;
	 */
	public static ArrayList<Integer> getOddNumber(int number) {
		ArrayList<Integer> oddNumber = new ArrayList<Integer>();

		for (int i = 0; i <= 19; i++) {

			if (i % 2 == 1) {

				oddNumber.add(i);
			}
		}

		return oddNumber;
	}

	/*
	 * Q6; input = int number; return = int; serving = variable;
	 */
	public static int getKilometer(int number) {
		int kilometer = 0;
		kilometer = number * 106;

		return kilometer;
	}

	/**
	 * Q7; input = String input ; return type = ArrayList<Integer>; serving bucket =
	 * list;
	 */
	public static ArrayList<Integer> getIndex(String name) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < name.length(); i++) {

			index.add(i);
		}

		return index;
	}

	/*
	 * Q8; input = String name; return type = ArrayList<Character>; serving bucket =
	 * list;
	 */
	public static ArrayList<Character> getcharList(String name) {
		ArrayList<Character> charList = new ArrayList<Character>();

		for (int i = 0; i < name.length(); i++) {

			charList.add(name.charAt(i));
		}

		return charList;
	}

	/*
	 * Q9; input = int number; return type = int ; serving bucket = variable;
	 */
	public static int getSum(int number) {
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}

		return sum;
	}

	/*
	 * Q10; input = int number; return type = int; serving bucket = variable;
	 */
	public static int getSquare(int number) {
		int square = 0;

		square = number * number;

		return square;
	}

	/*
	 * Q11; input = int number; return type = int[] ; serving bucket = Array;
	 */
	public static int[] getEvenList(int number) {
		int[] evenList = new int[number + 1];

		for (int i = 0; i <= number; i++) {

			evenList[i] = i;

		}

		return evenList;
	}

	/*
	 * Q12; input = int number; return type = int []; serving bucket = Array;
	 */
	public static int[] getOddList(int number) {
		int[] oddList = new int[number];

		for (int i = 1; i <= number; i++) {

			oddList[i - 1] = i;
		}

		return oddList;
	}

	/*
	 * Q13 = write a method that take one number input and return number list 0 to
	 * given number; input = int number; return type = ArrayList<Integer>; serving
	 * bucket = list;
	 */
	public static ArrayList<Integer> getTextList(int number) {
		ArrayList<Integer> textList = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			textList.add(i);
		}

		return textList;
	}
	/*
	 * Q14 = write a method that take one number input and return a number "fizz" if
	 * the given number divided by 5 and return "buzz" if the given number divided
	 * by 5&&3 otherwise return "fizzbuzz";
	 * 
	 * input = int number;
	 * return type = String;
	 * serving bucket = variable;
	 */

	public static String getComments(int number) {
		String comments = null;
		
		if (number%5==0 && number%3 ==0 ) {
			
			comments= "buzz";
		}else  if(number%5==0) {
			
			comments="fuzz";
		}else {
			comments="fizzbuzz";
		}
		
		
		
		return comments;
	}
}
