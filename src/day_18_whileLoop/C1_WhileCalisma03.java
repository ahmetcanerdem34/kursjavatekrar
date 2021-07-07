package day_18_whileLoop;

import java.util.Scanner;

public class C1_WhileCalisma03 {

	public static void main(String[] args) {
		
		  /*
        Kullanýcýda x  girilene kadar ekrana "Program çalýþýyor" yazan
        ve x girildiðinde ise "Program bitti" yazan programý yazýnýz.
        */
		
		
		int a=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("harf giriniz");
		String harf=scan.next();
		
		do {
			
			
			System.out.println("program çalýþýyor");
			
			if(harf.equalsIgnoreCase("x")){
				System.out.println("program bitti");
				break;
			}
				
			
		} while (a==0);
		
			
		}
			
		}



