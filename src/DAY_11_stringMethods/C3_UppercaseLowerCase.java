package DAY_11_stringMethods;

public class C3_UppercaseLowerCase {

	public static void main(String[] args) {


		
		String str="java �ok g�zeldir";
		String str1="JAVA G�ZEL OLACAK";
		
		
		
		System.out.println(str.toUpperCase());
		System.out.println(str1.toLowerCase());
		
//		JAVA �OK G�ZELD�R
//		java g�zel olacak
		
		System.out.println("****************************");
			
		
		System.out.println(str1.equals(str));
		System.out.println(str.equals(str1));
//		false
//		false
		
		System.out.println("*******************************");
		
		
		String str3="java �ok g�zeldir";
		System.out.println(str.equals(str3));
		//true
		
		String str4="java g�zeldir �ok";
		
		System.out.println(str.charAt(0)==str3.charAt(0));
		System.out.println(str.charAt(13)==str4.charAt(9));
//		true
//		//true
		
		System.out.println("********************************");
		
		String str5="JAVA �OK G�ZELD�R";
		
		System.out.println(str.equalsIgnoreCase(str5));
		System.out.println(str3.equalsIgnoreCase(str4));
//		true
//		false
		
		
		
		
	}

}
