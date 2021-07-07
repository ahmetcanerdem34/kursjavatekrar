package DAY_12;

import java.util.Scanner;

public class C4_ÝndexOfOrnek {

	public static void main(String[] args) {
		
//		Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
//		olmadigini yazdirin
		
		
		Scanner sc=new Scanner (System.in);
		
		System.out.print("bir cümle giriniz :");
		String cumle=sc.nextLine().toLowerCase();
		System.out.print("bir harf giriniz :");
		String harf =sc.next();
		
		System.out.println(cumle.indexOf(harf));
//		bir cümle giriniz :huysuz
//		bir harf giriniz :z
//		5
			
		
		
		
	}

}
