package day_18_whileLoop;

import java.util.Scanner;

public class C1_WhileCalisma03 {

	public static void main(String[] args) {
		
		  /*
        Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        */
		
		
		int a=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("harf giriniz");
		String harf=scan.next();
		
		do {
			
			
			System.out.println("program çalışıyor");
			
			if(harf.equalsIgnoreCase("x")){
				System.out.println("program bitti");
				break;
			}
				
			
		} while (a==0);
		
			
		}
			
		}



