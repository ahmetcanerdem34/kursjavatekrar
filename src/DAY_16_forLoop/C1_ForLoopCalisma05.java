package DAY_16_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma05 {

	public static void main(String[] args) {
		
		 /*  Problem Tan�m�
        Girilen bir say� kadar sat�r ve s�t�nu olan ve
        sa� kenara dayal� ��geni basan kodu yaz�n�z.

        Ekran ��kt�s�
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

		for (int i = 5; i <= 5; i++) {
			System.out.println();
			
			for (int j = 1; j >=i; j--) {
				
				System.out.print("*");
				
			}
			
		}
		
		
		
		
//      String string = "";
//      int count1 = 0;
//      while (count1 <= 5) {
//          string = string + "*";
//          
//          System.out.println(string);
//           count1++;
//           
           
           
           
           for(int i =0; i<=5; i++) {
               
           
           for(int j=1; j<=5-i; j++) {
               System.out.print(" ");
               
           }
           for (int k = 0; k<i; k++) {
               System.out.print("*");
              
          }
           System.out.println("");
  }
      }
  

		
		
			
		}
		
		
	
			
		
	


