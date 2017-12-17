package methods;

import java.util.ArrayList;

public class MethodPractice {

	public static void main(String[] args) {

		System.out.println("Q1 = " + getText("khan"));
		System.out.println("Q2 = " + getSubject("Khan"));
		System.out.println("Q3 = " + getUpperText("Khan"));
		System.out.println("Q4 = " + getEvenNumber(20));
		System.out.println("Q5 = " + getOddNumber(20));
		System.out.println("Q6 = " + getKilometer(5));
		System.out.println("Q7 = " + getIndex("borson"));


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
	public static ArrayList<Integer> getOddNumber(int number){
	ArrayList<Integer> oddNumber = new ArrayList<Integer>();
	
	for(int i=0; i<=19;i++) {
		
		if (i%2 == 1) {
			
			oddNumber.add(i);
		}
	}
	
	return oddNumber;
}
	/*
	 * Q6;
	 * input = int number;
	 * return = int;
	 * serving = variable;
	 */
	public static int getKilometer(int number) {
		int kilometer = 0;
		kilometer = number*106;
		
		return kilometer;
	}
	/**
	 * Q7;
	 * input = String input ;
	 * return type = ArrayList<Integer>;
	 * serving bucket = list;
	 */
	public static ArrayList<Integer> getIndex(String name){
		ArrayList<Integer> index = new ArrayList<Integer>();
		for ( int i=0; i<name.length(); i++) {

			index.add(i);
		}
		
		return index;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
