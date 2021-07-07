package DAY_12;

import java.util.Scanner;

public class C5_LastÝndexOf {

	public static void main(String[] args) {
		//kullanýcýdan bir cümle alýn
		   // ve aþaðýdaki 3 durumdan uygun olaný yazdýrýn
		//1cumla java içermiyor
		//2 cümle bir tane java içeiryor
		//3 cümlede 1 den fazla java var
		
		
			Scanner sc=new Scanner (System.in);
		
		System.out.println("bir string giriniz :");
		
		String cumle=sc.nextLine().toLowerCase();
		
		int ilkJava=cumle.indexOf("java");
		int sonJava=cumle.lastIndexOf("java");

		
		if(ilkJava==-1) {
			System.out.println("cümle java içermiyor");
		}else if(sonJava==ilkJava) {
			
			System.out.println("cümle 1 adet java içeriyor");
		}else {
			System.out.println("cümlede 1 den çok java var");
		}
	}

}
