package DAY_16_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma18 {

	public static void main(String[] args) {
		
		
		  // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String�in palindrome olup olmadigini kontrol eden bir program yazin.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle=scan.nextLine();//al�nan kelime tersten yazd�r�l�p, al�nan keimeye e�it olup olmad���na bak�l�r
		
		//hakan==nakah ise polidrome de�il
		
		String yeniKelime="";
		
		for (int i = cumle.length()-1; i >=0; i--) {// n-a-k-a-h
			
			
		yeniKelime=yeniKelime+cumle.charAt(i);
		
		}
		
		if(yeniKelime.equals(cumle)) {
			
			System.out.println("polindrome");
			
			
		}else {
			System.out.println("de�il");
		}
			
		
		
		
		
		

	}

}
