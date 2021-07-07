package DAY_12;

import java.util.Scanner;

public class C1_Lenghth {

	public static void main(String[] args) {
		
		
		//kullanýcýdan bir string girmesini isteyin 
				//girilen stringin son harfini büyük harf olarak yazdýýrn
				
				Scanner scan=new Scanner(System.in);
				
				System.out.print("lütfen bir cümle giriniz :");
				System.out.print("bir cümle giriniz :");
				String cumle=scan.nextLine().toUpperCase();
				
				System.out.println(cumle.charAt(cumle.length()-1));//R
				
//				lütfen bir cümle giriniz :bir cümle giriniz :java kod yazdýkça geliþecek bir dildir
//				R

				System.out.println("************************************");
				
				
				String str="kahraman ordunun kahraman askerleri";
				
			String buyukHarf=str.toUpperCase();
			
			System.out.println(buyukHarf.charAt(buyukHarf.length()-1));//Ý
			
	}

}
