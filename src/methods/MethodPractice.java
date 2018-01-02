package methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

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

		int[] numberlist = { 2, 4, 8, 90 };
		System.out.println("Q15 = " + getMinimumNum(numberlist));

		int[] numlist = { 2, 4, 8, 90 };
		System.out.println("Q16 = " + getMaximumNumber(numlist));
		System.out.println("Q17 = " + getValue(10));
		System.out.println("Q18 = " + getValueOfInt("20"));
		System.out.println("Q19 = " + getCharacter("borsonkhan"));
		System.out.println("Q20 = " + getSumOfIndex("borsonkhan"));
		System.out.println("Q21 = " + getLastFiveWord("Borsonkhan"));
		System.out.println("Q22 = " + getFirstFiveWord("Borsonkhanok"));
		System.out.println("Q23 = " + getFiveToTenChar("Borsonkhan"));
		System.out.println("Q24 = " + getAllWord("my name is Khan"));
		System.out.println("Q25 = " + getFirstWord("my name is Khan"));
		System.out.println("Q26 = " + getCount("borson Khan", "Khan"));
		System.out.println("Q27 = " + getCountChar("I m  khan", 'i'));
		System.out.println("Q28 = " + getBoolean("borson Khan", "khan"));
		System.out.println("Q29 = " + getConsonent("borsonkhan"));
		System.out.println("Q30 = " + getCountOfVowels("borsonkhana"));
		System.out.println("Q31 = " + getCountOfChar("Borson Khan"));
		System.out.println("Q32 = " + getTextWithoutSpace("Borson Khan"));
		System.out.println("Q33 = " + getRepeatedText("Borson Khan"));
		System.out.println("Q34 = " + getUniquetext("Borson Khan"));

		int[] number = { 3, 5, 6, 7 };
		System.out.println("Q35 = " + getSumOfArray(number));
		
		ArrayList<Integer> mumlist = new ArrayList<Integer>();
		
		
		mumlist.add(5);
		mumlist.add(6);
		mumlist.add(10);
		System.out.println("Q36 = " + getSumOfList(mumlist));
		
		System.out.println("Q37 = " + getReverseText("borson"));
		
		ArrayList<Integer> numbero = new ArrayList<Integer>();
		numbero.add(5);
		numbero.add(6);
		numbero.add(10);
		System.out.println("Q38 = " + Arrays.toString(getConvertText(numbero)));
		
		int[] numberTwo = {4 ,5 ,9,6};
		System.out.println("Q39 = " + getConvertListText(numberTwo ));
		
		int[] numberThird = {2,4,60,6};
		System.out.println("Q40 = " + Arrays.toString(getSortedArray(numberThird )));
		
        ArrayList<Integer> numberFour = new ArrayList<Integer>();
		
		
		numberFour.add(5);
		numberFour.add(6);
		numberFour.add(10);

		System.out.println("Q41 = " + getSortedList(numberFour));
		
		int[] numOne = {4 ,5 ,9,6,8,19};
		System.out.println("Q42 = " + Arrays.toString(getBubbleText(numOne )));
		

	}

	/*
	 * Que 1 = write a method that take string input and return your name;
	 * input = String name;
	 * return = String; 
	 * serving bucket = variable;
	 */
	

	public static String getText(String name) {
		String text = " ";

		text = name;

		return text;
	}

	/*
	 * Q2 = write  a method that take string input and return same as a upper case;
	 * input = String name; 
	 * return = String ; 
	 * serving bucket = variable;
	 */

	public static String getSubject(String name) {
		String subject = " ";

		subject = name.toLowerCase();

		return subject;
	}

	/**
	 *   Q3= write  a method that take one string input and return same string as a lower case;
	 *   input = String name;
	 *   return type = String; 
	 *   serving bucket = variable;
	 */

	public static String getUpperText(String name) {
		String upperText = " ";

		upperText = name.toUpperCase();

		return upperText;
	}

	/*
	 * Q4 = write a method that take one number input and return the list of all ecen number from o to that given number
	 * input = int number; 
	 * return type = ArrayList<Integer>; 
	 * serving bucket = list;
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
	 * Q5= write a method a number input and return the list of all odd number from 0 to that given number;
	 * input = int number; 
	 * return type = ArrayList<Integer>; 
	 * serving bucket =list;
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
	 * Q6 = write a method that take input as mile and return as a kilometer; 
	 * input = int number; 
	 * return = int;
	 * serving = variable;
	 */
	public static int getKilometer(int number) {
		int kilometer = 0;
		kilometer = number * 106;

		return kilometer;
	}

	/**
	 * Q7 = write a method that take one string input and return a list of all index; 
	 * input = String input ; 
	 * return type = ArrayList<Integer>; 
	 * serving bucket = list;
	 */
	public static ArrayList<Integer> getIndex(String name) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < name.length(); i++) {

			index.add(i);
		}

		return index;
	}

	/*
	 * Q8 = write a method that take one string and return list of all character; 
	 * input = String name;
	 * return type = ArrayList<Character>; 
	 * serving bucket = list;
	 */
	public static ArrayList<Character> getcharList(String name) {
		ArrayList<Character> charList = new ArrayList<Character>();

		for (int i = 0; i < name.length(); i++) {

			charList.add(name.charAt(i));
		}

		return charList;
	}

	/*
	 * Q9 = write a method take one number input and return the sum of 1 to that given number; 
	 * input = int number; 
	 * return type = int ; 
	 * serving bucket = variable;
	 */
	public static int getSum(int number) {
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}

		return sum;
	}

	/*
	 * Q10 = write a method that take one number and return square of the that number; 
	 * input = int number; 
	 * return type = int; 
	 * serving bucket = variable;
	 */
	public static int getSquare(int number) {
		int square = 0;

		square = number * number;

		return square;
	}

	/*
	 * Q11 = write a method that take one number input and return an array that contain 0 to given number; 
	 * input = int number; 
	 * return type = int[] ; 
	 * serving bucket = Array;
	 */
	public static int[] getEvenList(int number) {
		int[] evenList = new int[number + 1];

		for (int i = 0; i <= number; i++) {

			evenList[i] = i;

		}

		return evenList;
	}

	/*
	 * Q12 = write a method take one number input and return an array that contain 1 to that given number; 
	 * input = int number; 
	 * return type = int []; 
	 * serving bucket = Array;
	 */
	public static int[] getOddList(int number) {
		int[] oddList = new int[number];

		for (int i = 1; i <= number; i++) {

			oddList[i - 1] = i;
		}

		return oddList;
	}

	/*
	 * Q13 = write a method that take one number input and return number list 0 to given number; 
	 * input = int number; 
	 * return type = ArrayList<Integer>; 
	 * servingbucket = list;
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

		if (number % 5 == 0 && number % 3 == 0) {

			comments = "buzz";
		} else if (number % 5 == 0) {

			comments = "fuzz";
		} else {
			comments = "fizzbuzz";
		}

		return comments;
	}

	/*
	 * Q15 = write a method that take one number array input and return the minimum number ; 
	 * input = int[] numberlist;
	 *  return type = int; 
	 *  serving bucket = variable;
	 */
	public static int getMinimumNum(int[] numberlist) {
		int minimumNum = numberlist[0];

		for (int i = 0; i < numberlist.length; i++) {

			if (minimumNum > numberlist[i]) {

				minimumNum = numberlist[i];
			}
		}

		return minimumNum;
	}

	/*
	 * Q16 = write a method that take one number array and return the maximum number;
	 *  input = int[] numlist;
	 *   return type = int; 
	 *   serving bucket = variable;
	 */
	public static int getMaximumNumber(int[] numlist) {
		int maximumNumber = numlist[0];

		for (int i = 0; i < numlist.length; i++) {

			if (maximumNumber < numlist[i]) {
				maximumNumber = numlist[i];

			}
		}

		return maximumNumber;
	}

	/*
	 * Q17 = write a method that take a number input and return the same value as string; 
	 * input = int number;
	 *  return type = String; 
	 *  serving bucket = variable;
	 */
	public static String getValue(int number) {
		String value = " ";

		String massage = String.valueOf(number);

		value = massage;
		return value;
	}

	/*
	 * Q18 = write a method that take a string representation of number input and return the same value as a int;
	 *  input = String name; 
	 *  return type = int ;
	 * serving bucket = variable;
	 */
	public static int getValueOfInt(String name) {
		int value = 0;

		int massage = Integer.valueOf(name);

		value = massage;

		return value;
	}

	/*
	 * Q19 = write a method take string input and return true if it contain char 'o'
	 * otherwise false; 
	 * input = String name; 
	 * return type = boolean; 
	 * serving bucket = variable;
	 */
	public static boolean getCharacter(String name) {
		boolean character = true;

		character = name.contains("o");

		return character;
	}

	/*
	 * Q20 = write a method that take one string input and return the sum of all
	 * index;
	 *  input = String name; 
	 *  return type = int; 
	 *  serving bucket = variable;
	 */
	public static int getSumOfIndex(String name) {
		int sum = 0;

		for (int i = 0; i < name.length(); i++) {

			sum = sum + i;
		}

		return sum;
	}

	/*
	 * Q21 = write a method that take one string and return a list of last five
	 * character;
	 *  input = String name;
	 *   return type = ArrayList<Character>; 
	 *   serving bucket = list;
	 */
	public static ArrayList<Character> getLastFiveWord(String name) {
		ArrayList<Character> lastFiveWord = new ArrayList<Character>();

		for (int i = name.length() - 5; i < name.length(); i++) {

			lastFiveWord.add(name.charAt(i));
		}

		return lastFiveWord;
	}

	/*
	 * Q22 = write a method that take one string and return a list of first five
	 * character; 
	 * input = String name; 
	 * return type = ArrayList<Character>;
	 *  serving bucket = list;
	 */
	public static ArrayList<Character> getFirstFiveWord(String name) {

		ArrayList<Character> firstFiveWord = new ArrayList<Character>();

		for (int i = 0; i < 5; i++) {

			firstFiveWord.add(name.charAt(i));
		}

		return firstFiveWord;
	}

	/*
	 * Q23 = write a method that take a string input and return 5 to 10 character as a string; 
	 * input = String name;
	 * return type = String; 
	 * serving bucket =variable;
	 */
	public static String getFiveToTenChar(String name) {
		String fiveToTenChar = " ";

		fiveToTenChar = name.substring(4, 10);

		return fiveToTenChar;
	}

	/*
	 * Q24 = write a method that take one String input and return all word; 
	 * input =String name; 
	 * return type = ArrayList<string> ; 
	 * serving bucket = list;
	 */
	public static ArrayList<String> getAllWord(String name) {
		ArrayList<String> allWord = new ArrayList<String>();

		String[] wordArray = name.split(" ");

		for (int i = 0; i < wordArray.length; i++) {

			allWord.add(wordArray[i]);

		}

		return allWord;
	}

	/*
	 * Q25 = write a method take one string input and return first word; 
	 * input = oneString name;
	 * return type = String; 
	 * serving bucket = variable;
	 */
	public static String getFirstWord(String name) {
		String firstWord = " ";

		String[] wordArray = name.split(" ");

		for (int i = 0; i < wordArray.length; i++) {

			firstWord = wordArray[0];
		}

		return firstWord;
	}

	/*
	 * Q25 = write a method take one string input and return first word;
	 *  input = oneString name;
	 *  return type = String; 
	 *  serving bucket = variable;
	 */
	public static String getFirsWord(String name) {
		String firstWord = " ";

		String[] wordArray = name.split(" ");

		for (int i = 0; i < wordArray.length; i++) {

			firstWord = wordArray[0];
		}

		return firstWord;
	}

	/*
	 * Q26 = write a method take one string and one word input and return the countof that gien word;
	 * input = String name , 
	 * String word; return type = int ;
	 * serving bucket = variable;
	 */
	public static int getCount(String name, String word) {
		int count = 0;

		String[] wordArray = name.split(" ");

		for (int i = 0; i < wordArray.length; i++) {

			if (wordArray[i].equalsIgnoreCase(word)) {
				count = count + 1;
			}
		}

		return count;
	}

	/*
	 * Q27 = write a method that take one string and one character input and return the count of given character; 
	 * input = String name , 
	 * char num; return type = int ;
	 * serving bucket = variable;
	 */
	public static int getCountChar(String name, char num) {
		int countChar = 0;

		name = name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == num) {

				countChar = countChar + 1;
			}
		}

		return countChar;
	}

	/*
	 * Q28 = write a method one string and one word input and return ture if that sentence contain given word otherwise false; 
	 * input = string name, 
	 * String word; 
	 * return type = boolean; 
	 * serving bucket = variable;
	 */
	public static boolean getBoolean(String name, String word) {
		boolean subject = false;

		name = name.toLowerCase();

		String[] wordArray = name.split(" ");

		for (int i = 0; i < wordArray.length; i++) {

			if (wordArray[i].equalsIgnoreCase(word)) {

				subject = true;

			}
		}

		return subject;
	}

	/*
	 * Q29 = write a method that take one string and return the count of all consonant;
	 * input = string name; 
	 * return type = int; 
	 * serving bucket = variable;
	 */
	public static int getConsonent(String name) {
		int consonent = 0;

		String massage = "bcdfghjklmnpqrstvwxYZ";

		massage = massage.toLowerCase();

		for (int i = 0; i < name.length(); i++) {

			String character = String.valueOf(name.charAt(i));

			if (massage.contains(character)) {

				consonent = consonent + 1;
			}
		}

		return consonent;
	}

	/*
	 * Q30 = write a method that take one String input and return the count of all vowels; 
	 * input = String name; 
	 * return type = int; 
	 * serving bucket = variable;
	 */
	public static int getCountOfVowels(String name) {
		int vowels = 0;

		String vowel = "aeiou";

		name = name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {

			String character = String.valueOf(name.charAt(i));

			if (vowel.contains(character)) {

				vowels = vowels + 1;
			}
		}

		return vowels;
	}

	/*
	 * Q31 = write a method that take one string input and return the count of allupper case character; 
	 * input = String name; 
	 * return type = int ; 
	 * serving bucket= variable;
	 */
	public static int getCountOfChar(String name) {
		int countOfChar = 0;

		for (int i = 0; i < name.length(); i++) {

			if (Character.isUpperCase(name.charAt(i))) {
				countOfChar = countOfChar + 1;
			}
		}

		return countOfChar;
	}

	/*
	 * Q32 = write a method that take one string and return count of character without whispace; 
	 * intput = String name; 
	 * return type = int ; 
	 * serving bucket = variable;
	 */
	public static int getTextWithoutSpace(String name) {
		int text = 0;

		name = name.toLowerCase();

		name.replaceAll(" ", "");

		text = name.length();

		return text;
	}

	/*
	 * Q33 = write a method that take one string input and return all repeatedcharacters without whitespace 
	 * input = string name; 
	 * return type = String;
	 * serving bucket = variable;
	 */

	public static String getRepeatedText(String name) {
		String text = " ";
		name = name.replaceAll(" ", "");
		name.toLowerCase();

		for (int i = 0; i < name.length(); i = i + 1) {

			for (int j = i + 1; j < name.length(); j++) {

				if (name.charAt(i) == name.charAt(j)) {

					String character = String.valueOf(name.charAt(i));

					if (!text.contains(character)) {

						text = text + name.charAt(j);
					}
					break;
				}
			}

		}

		return text;
	}

	/**
	 * Q34 = Write a method that take one string input and return all the unique characters without whitespace
	 * input = String name; 
	 * return type = String;
	 * serving bucket = variable;
	 */
	public static String getUniquetext(String name) {
		String uniqueText = " ";
		name = name.replaceAll(" ", "");
		name.toLowerCase();

		uniqueText = name;

		for (int i = 0; i < name.length(); i++) {

			for (int j = i + 1; j < name.length(); j++) {

				String character = String.valueOf(name.charAt(i));

				if (name.charAt(i) == name.charAt(j)) {

					uniqueText = uniqueText.replaceAll(character, "");
				}
			}
		}

		return uniqueText;
	}

	/*
	 * Q35 = write a method that take one int array and return sum of all value;
	 * input = int [] numberArray; 
	 * return type = int; 
	 * serving bucket = variable;
	 */
	public static int getSumOfArray(int[] number) {
		int sum = 0;

		for (int i = 0; i < number.length; i++) {

			sum = sum + number[i];
		}

		return sum;
	}
	
	/*
	 * Q36 = write a method that take one int list input and return sum of all value
	 * input = Arraylist<Integer> mumlist
	 * return = int;
	 * serving bucket = variable;
	 */

	public static int getSumOfList(ArrayList<Integer> mumlist) {
		int sum = 0;
		
		for (int i=0; i<mumlist.size();i++) {
			
			sum = sum + mumlist.get(i);		}
		
		return sum;
	}
	
	/*
	 * Q37 = write method that take one string input and retrun same string  in reverse order'
	 * input = string name;
	 * return type = String;
	 * serving bucket = variable
	 */
	public static String getReverseText (String name) {
		String text = " ";
		
		for (int i= name.length()-1 ; i>=0; i--) {
			text = text + name.charAt(i);
		}
		
		return text;
	}
	
	/*
	 * Q38 = write a method take one int list input then convert that to an array and return that array;
	 * input = ArrayList<Integer> number
	 * return type = list
	 * serving bucket = object list
	 */
	public static Object [] getConvertText(ArrayList<Integer> numbero) {
		Object [] convertText = new Object [numbero.size()];
		
		convertText =  numbero.toArray();
		return convertText;
	}
	
	/*
	 * Q39 = write a method that take a int array input then convert that to a list and return list;
	 * input = int[]  numberTwo
	 * return type = list;
	 * serving bucket = list;
	 */
	
	public static ArrayList<Integer> getConvertListText(int [ ] numberTwo){
		ArrayList<Integer> text = new ArrayList<Integer>();
		
		for (int i=0 ; i<numberTwo.length; i++) {
			
			text.add(numberTwo[i]);
		}
		return text;
	}
	
	/*
	 * Q40 = write a method take one number array input and return the sorted array;
	 * input = int[] numberThird;
	 * return = int[];
	 * serving bucket = array;
	 */
	public static int[] getSortedArray(int [] numberThird) {
		int [] text = new int[numberThird.length]  ;
		
		Arrays.sort(numberThird);
		
		text = numberThird;
		return text;
	}
	
	/*
	 * Q41 = write a method that take one number list input and return the sorted list;
	 * input = ArrayList<Integer> numberFour;
	 * return type = list;
	 * serving bucket = list;
	 */
	public static ArrayList<Integer> getSortedList(ArrayList<Integer> numberFour){
		
		ArrayList<Integer> subject = new ArrayList<Integer>();
		
		Collections.sort(numberFour);
	
		subject = numberFour;
	
		return subject;
	}
	/*
	 * Q42 = write a method that take a int [] input and return the bubble sorted array;
	 * input = int[] numberArray;
	 * return type = int[];
	 * serving bucket = Array;
	 */
	public static int[] getBubbleText (int [] numOne) {
		int[] text = new int[numOne.length];
		
		for (int i=0; i<numOne.length; i++) {
			  
			for (int j=i+1 ;j<numOne.length;j++) {
				
				if (numOne[i] < numOne[j]) {
					
					int value = numOne[i];
					      numOne[i] = numOne[j];
					          numOne[j] = value;
				} } }
		     text = numOne;
		
		return text;
	}
	
 	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
