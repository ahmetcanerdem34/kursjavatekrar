package DAY_11_stringMethods;

public class C1_Concatination {

	public static void main(String[] args) {
		
		
		
		System.out.println(25+20+" "+"Merhaba");
		System.out.println("bu �ek,ilde nas�l olur:" +25+20+" "+"Merhaba");
//		45 Merhaba
//		bu �ek,ilde nas�l olur:2520 Merhaba
		

		System.out.println("bu �ekilde nas�l olur :" +(25+20+" "+"Merhaba"));
//		bu �ekilde nas�l olur :45 Merhaba
	
		
		System.out.println("********************************************");
		
		String str1 ="Java";
		String str2 ="World";
		
		
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(" "+str2));
		System.out.println(str1.concat(" ").concat(str2).concat(" ").concat(str1));
		System.out.println(str2.concat(" ".concat(str2)));
//		JavaWorld
//		Java World
//		Java World Java
//		World World
		
		
	}

}
