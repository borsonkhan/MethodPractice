package methods;

public class MethodPractice {

	public static void main (String [] args) {
		
		System.out.println("Q1 = " + getText("khan"));
		System.out.println("Q2 = " + getSubject("Khan"));
		System.out.println("Q2 = " + getUpperText("Khan"));
		
		
	}
	
	
	
 /*
  * Que 1 ;
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
	 * Q2;
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
	 * Q3;
	 * input = String name;
	 * return type = String;
	 * serving bucket = variable;
	 */
	
	public static String getUpperText(String name) {
		String upperText = " ";
		
		upperText = name.toUpperCase();
		
		return upperText;
	}
	
	
}
