package DAY_12;

import java.util.Scanner;

public class C4_�ndexOfOrnek {

	public static void main(String[] args) {
		
//		Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
//		olmadigini yazdirin
		
		
		Scanner sc=new Scanner (System.in);
		
		System.out.print("bir c�mle giriniz :");
		String cumle=sc.nextLine().toLowerCase();
		System.out.print("bir harf giriniz :");
		String harf =sc.next();
		
		System.out.println(cumle.indexOf(harf));
//		bir c�mle giriniz :huysuz
//		bir harf giriniz :z
//		5
			
		
		
		
	}

}
