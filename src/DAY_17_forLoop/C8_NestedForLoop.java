package DAY_17_forLoop;

import java.util.Scanner;

public class C8_NestedForLoop {

	public static void main(String[] args) {
		
/*		
		Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
		  *  //for(int i =1; i<=2;i++) syso("*" )
		  * *  //for(int i =1; i<=2;i++) syso("*" )
		  * * * //for(int i =1; i<=3;i++) syso ("*" )
		  * * * * //for(int i =1; i<=4;i++) syso ("*" )
		  */
		

		
		Scanner scan=new Scanner (System.in);
		System.out.print("10 dan küçük pozi tamsayý griniz :");
		int sayi=scan.nextInt();
		
		
		for (int i = 1; i <=sayi; i++) {//sayý 5 diyelim
			System.out.println(" ");
			
			
			for (int j = 0; j < i; j++) {
				
				System.out.print("*");
scan.close();				
				
			}
			
		}
		
	}

}
