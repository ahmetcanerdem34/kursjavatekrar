package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
		
		

		// Kullanicidan bir email isteyin
				// eger @ isareti ivecermiyorsa "girdiginiz bilgi email degil"
				// eger @ isareti iceriyor ama @gmail.com icermiyorsa "lutfen gmail adresi yazin"
				// eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa "gecersiz gmail adresi" yazsin

		
				Scanner scan=new Scanner(System.in);
				System.out.println("email adresi girni :");
				String email=scan.nextLine();
				
				
					if (!email.contains("@")) {
						
						System.out.println("girdi�iniz bilgi email de�il");
						
					} else if(email.contains("@") && !email.contains("@gmail.com")){
						System.out.println("l�tfen ge�erli mail adresi yaz�n");
				
					}else if(email.contains("@gmail.com")) {
						System.out.println("ge�erli mail adresi");
					}else {
						System.out.println("ge�ersiz mail adresi");
						
						scan.close();
					}
}
}