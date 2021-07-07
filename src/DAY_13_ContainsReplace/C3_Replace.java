package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C3_Replace {

	public static void main(String[] args) {
		
		

		// Kullanicidan bir cumle isteyin
				// cumledeki tum bosluklari silin ve
				// tum a'larin yerine e yazdirin
		
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("lütfen bir cümle giriniz :");
		String str =scan.nextLine();
		
		
		System.out.println(str.replace(" ","").strip().replace('a', 'e'));
//		lütfen bir cümle giriniz :kardan adam karýn yoðunluðu ile yapýlýr
//		kerdenedemkerýnyoðunluðuileyepýlýr
scan.close();
	}

}
