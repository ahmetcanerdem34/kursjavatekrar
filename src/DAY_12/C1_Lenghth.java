package DAY_12;

import java.util.Scanner;

public class C1_Lenghth {

	public static void main(String[] args) {
		
		
		//kullan�c�dan bir string girmesini isteyin 
				//girilen stringin son harfini b�y�k harf olarak yazd��rn
				
				Scanner scan=new Scanner(System.in);
				
				System.out.print("l�tfen bir c�mle giriniz :");
				System.out.print("bir c�mle giriniz :");
				String cumle=scan.nextLine().toUpperCase();
				
				System.out.println(cumle.charAt(cumle.length()-1));//R
				
//				l�tfen bir c�mle giriniz :bir c�mle giriniz :java kod yazd�k�a geli�ecek bir dildir
//				R

				System.out.println("************************************");
				
				
				String str="kahraman ordunun kahraman askerleri";
				
			String buyukHarf=str.toUpperCase();
			
			System.out.println(buyukHarf.charAt(buyukHarf.length()-1));//�
			
	}

}
