package DAY_11_stringMethods;

public class C2_CharAt {

	public static void main(String[] args) {
		
		
		String str="Java çok güzel";
		
		
		System.out.print(str.charAt(0)+" ");
		System.out.print(str.charAt(1)+" ");
		System.out.print(str.charAt(2)+" ");
		System.out.println(str.charAt(3));
		//J a v a
		
		System.out.println(str.charAt(13));//l
		
		
		System.out.println("**********************");
		
		System.out.print(str.substring(0,4));
		System.out.print(" ");
		System.out.print(str.substring(5,8));
		System.out.print(" ");
		System.out.print(str.substring(9));
		//Java çok güzel
		
		System.out.println("*****************************");
		
		System.out.println(str.length());
		System.out.println(str.length()-1);
//		14
//		13
		
		System.out.println("*********************");
		String str1="Java çok güzel";
		System.out.println(str1.length());//uzunluðu
		System.out.println(str.length()-1);//index sayýsý
		
		
	}

}
