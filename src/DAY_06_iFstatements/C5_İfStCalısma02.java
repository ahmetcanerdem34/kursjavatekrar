package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_�fStCal�sma02 {

	public static void main(String[] args) {
		
		
		 /*
	    60 de�erinde bir int olu�turun.
	    E�er int 9'a b�l�n�nce kalan 0 ise ve 5'e b�l�n�nce kalan 0 ise "Able to divide by 9 and 5" yazd�r�n.
	    E�er int 4'e b�l�n�nce kalan 0 ise ve 5'e b�l�n�ce kalan 0 ise "Able to divide by 4 and 15" yazd�r�n.
	    */
		int sayi=60;
		if (sayi%9==0 && sayi%5==0) {
			
			System.out.println("Able to divide by 9 and 5");
			
		} else if (sayi%4==0 && sayi%5==0) {
			
			System.out.println("Able to divide by 4 and 15");
			//Able to divide by 4 and 15
		}
		
		
		/*   kullan�c�dan String number olu�turun.
        E�er String � karakterini kaps�yorsa "This is euro" yazd�r�n.
        E�er String $ karakterini kaps�yorsa "This is dollar" yazd�r�n.
        Aksi halde (else) "no money" yazd�r�n.
   */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("g�n ismi giriniz :");
		String euro=scan.nextLine();
		
		if(euro.contains("�")) {
			
			System.out.println("This is euro");
		}else if (euro.contains("$")){
			System.out.println("This is dollar");
			
//			g�n ismi giriniz :g�n euro� g�n�
//			This is euro
			
//			g�n ismi giriniz :g�n dolar$ g�n�
//			This is dollar
			
		}
		
		/*   45 de�erinde bir double olu�turun.
        E�er double 5'e b�l�n�nce kalan 0 ise ve double 8'e b�l�n�nce kalan 0 ise
        "able to divide by 5 and 8" yazd�r�n�z.

        E�er double 10'a b�l�n�nce kalan 5 ise ve double 9'a b�l�n�nce kalan 0 ise
        "able to divide by 9 and divide by 10 reminder is 5" yazd�r�n�z.
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