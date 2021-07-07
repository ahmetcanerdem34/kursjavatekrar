package DAY_11_stringMethods;

public class C3_UppercaseLowerCase {

	public static void main(String[] args) {


		
		String str="java çok güzeldir";
		String str1="JAVA GÜZEL OLACAK";
		
		
		
		System.out.println(str.toUpperCase());
		System.out.println(str1.toLowerCase());
		
//		JAVA ÇOK GÜZELDÝR
//		java güzel olacak
		
		System.out.println("****************************");
			
		
		System.out.println(str1.equals(str));
		System.out.println(str.equals(str1));
//		false
//		false
		
		System.out.println("*******************************");
		
		
		String str3="java çok güzeldir";
		System.out.println(str.equals(str3));
		//true
		
		String str4="java güzeldir çok";
		
		System.out.println(str.charAt(0)==str3.charAt(0));
		System.out.println(str.charAt(13)==str4.charAt(9));
//		true
//		//true
		
		System.out.println("********************************");
		
		String str5="JAVA ÇOK GÜZELDÝR";
		
		System.out.println(str.equalsIgnoreCase(str5));
		System.out.println(str3.equalsIgnoreCase(str4));
//		true
//		false
		
		
		
		
	}

}
