package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_�fStCal�sma01 {

	public static void main(String[] args) {
		
		   /* kullan�c�dan al�nacak double1 ve double2 isimli iki tane double olu�turulmu�tur
		    
        E�er double1, double2'dan b�y�k ise "double 1 is greater than double 2" yazd�r�n�z.
        E�er double1, double2'dan k���k ise "double 1 is smaller than double 2" yazd�r�n�z.
        */

		
		double sayi1=15.5;
		double sayi2=12.56;
		
		
		if(sayi1>sayi2) {
			System.out.println("double 1 is greater than double 2");
			
		}else
			System.out.println("double 1 is smaller than double 2" );
		
		//double 1 is greater than double 2
		
		
		
		 /*     kullan�c�dan al�n�arak  int number olu�turun.
        E�er int number 0 yazd�r�l�rsa "Im neutral",
        E�er int number 0'dan b�y�kse "I m positive",
        E�er int number 0'dan k���kse "I am negative" yazd�r�ls�n.   */

		
		Scanner scan = new Scanner(System.in);
		System.out.print("say� giriniz:");
		int sayi=scan.nextInt();
		
		
		if (sayi==0) {
			System.out.println("\"Im neutral\"");
			
		}else if (sayi>0) {
			
			System.out.println("\"I m positive\",");
		}else
			System.out.println("\"I am negative\" ");
		
//		say� giriniz:-12
//		"I am negative" 
//		say� giriniz:34
//		"I m positive",
		
		
		
		 /*  kullan�c�dan alaca��n�z int number i�in
	     E�er, int number ikiye b�l�nd���nde geri kalan� 0'a e�it ise "number is a EVEN number" yazd�r�n.
	     E�er, int number ikiye b�l�nd���nde geri kalan� 0'a e�it de�il ise "number is a ODD number" yazd�r�n.
	*/
		
		if (sayi%2==0) {
			
			System.out.println("number is a EVEN number" );
			
		}else
			System.out.println("number is a ODD number");
//		say� giriniz:45
//		number is a ODD number
		
		
		  /*  33 de�erinde bir int olu�turun.
        E�er, 33'� 4'e b�ld���n�zde kalan 3'e e�it ise "Remainder is 3" yazd�r�n�z.
        E�er, 33'� 4'e b�ld���n�zde kalan 2'e e�it ise "Remainder is 2" yazd�r�n�z.
        E�er, 33'� 4'e b�ld���n�zde kalan 1'e e�it ise "Remainder is 1" yazd�r�n�z.
        Aksi halde (else) "Reminder is 0" yazd�r�n�z.  */
		
		
		if (sayi%4==3) {
			
			System.out.println("\"Remainder is 3\" ");
			
		}else if(sayi%4==2) {
			
			System.out.println("Remainder is 2" );
		}
		else if (sayi%4==1) {
			System.out.println("Remainder is 1");
			
		}else
			System.out.println("\"Reminder is 0\" ");
		
//		say� giriniz:33
//		"I m positive",
//		number is a ODD number
//		Remainder is 1
		
	
		scan.close();
		
	}

}
