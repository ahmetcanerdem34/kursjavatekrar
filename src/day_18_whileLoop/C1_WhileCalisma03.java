package day_18_whileLoop;

import java.util.Scanner;

public class C1_WhileCalisma03 {

	public static void main(String[] args) {
		
		  /*
        Kullan�c�da x  girilene kadar ekrana "Program �al���yor" yazan
        ve x girildi�inde ise "Program bitti" yazan program� yaz�n�z.
        */
		
		
		int a=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("harf giriniz");
		String harf=scan.next();
		
		do {
			
			
			System.out.println("program �al���yor");
			
			if(harf.equalsIgnoreCase("x")){
				System.out.println("program bitti");
				break;
			}
				
			
		} while (a==0);
		
			
		}
			
		}



