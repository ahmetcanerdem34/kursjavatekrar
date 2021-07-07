package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_ÝfStCalýsma02 {

	public static void main(String[] args) {
		
		
		 /*
	    60 deðerinde bir int oluþturun.
	    Eðer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdýrýn.
	    Eðer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdýrýn.
	    */
		int sayi=60;
		if (sayi%9==0 && sayi%5==0) {
			
			System.out.println("Able to divide by 9 and 5");
			
		} else if (sayi%4==0 && sayi%5==0) {
			
			System.out.println("Able to divide by 4 and 15");
			//Able to divide by 4 and 15
		}
		
		
		/*   kullanýcýdan String number oluþturun.
        Eðer String € karakterini kapsýyorsa "This is euro" yazdýrýn.
        Eðer String $ karakterini kapsýyorsa "This is dollar" yazdýrýn.
        Aksi halde (else) "no money" yazdýrýn.
   */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("gün ismi giriniz :");
		String euro=scan.nextLine();
		
		if(euro.contains("£")) {
			
			System.out.println("This is euro");
		}else if (euro.contains("$")){
			System.out.println("This is dollar");
			
//			gün ismi giriniz :gün euro£ günü
//			This is euro
			
//			gün ismi giriniz :gün dolar$ günü
//			This is dollar
			
		}
		
		/*   45 deðerinde bir double oluþturun.
        Eðer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
        "able to divide by 5 and 8" yazdýrýnýz.

        Eðer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
        "able to divide by 9 and divide by 10 reminder is 5" yazdýrýnýz.
    */	
		
		double i =45;
		
		
		if (i % 5 ==0 && i % 8 == 0) {
			
			System.out.println("able to divide by 5 and 8");
			
		} else if(i % 10==5 && i %9==0){
			System.out.println("able to divide by 9 and divide by 10 reminder is 5");
//able to divide by 9 and divide by 10 reminder is 5
		}
		
}
	}