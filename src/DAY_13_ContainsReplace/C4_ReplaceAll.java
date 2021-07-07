package DAY_13_ContainsReplace;

public class C4_ReplaceAll {

	public static void main(String[] args) {
		
		
		
		String str="ava ogren hayati yakala";//ingilizce harfler olmasýna dikkat edin
		
		System.out.println(str.replaceAll("\\w", "*"));
		//**** ***** ****** ******
		System.out.println("****************************");
		
		String str1="Z+y+a G+k+l+";
		System.out.println(str1.replaceAll("\\W", "-"));
		//Z-y-a-G-k-l-
		
		
		System.out.println("***********************");
		
		String str2="Ziya Gökalp";
		System.out.println(str2.substring(0,1)+str2.substring(5,6));
		//ZG
		
	}

}
