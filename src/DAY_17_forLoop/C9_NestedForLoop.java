package DAY_17_forLoop;

import java.util.Scanner;

public class C9_NestedForLoop {

	public static void main(String[] args) {
		//kullanýcýdan pozitif rakam girmesini isteyin 
				//girilen sayýya kadar çarpým tablosu oluþturun 
				 /*
				  1 2 3
				  2 4 6
				  3 6 9 
				   
				  */
				
				
				Scanner scan=new Scanner (System.in);
				System.out.print("10 dan küçük pozi tamsayý griniz :");
				int sayi=scan.nextInt();
				
				
				for (int i = 1; i <=sayi; i++) {
					System.out.println("*********************");
					
					for (int j = 0; j <=sayi ;j++) {
						
						System.out.println(i+" "+"x"+" "+j+" "+(i*j));
						
//						10 dan küçük pozi tamsayý griniz :5
//						*********************
//						1 x 0 0
//						1 x 1 1
//						1 x 2 2
//						1 x 3 3
//						1 x 4 4
//						1 x 5 5
//						*********************
//						2 x 0 0
//						2 x 1 2
//						2 x 2 4
//						2 x 3 6
//						2 x 4 8
//						2 x 5 10
//						*********************
//						3 x 0 0
//						3 x 1 3
//						3 x 2 6
//						3 x 3 9
//						3 x 4 12
//						3 x 5 15
//						*********************
//						4 x 0 0
//						4 x 1 4
//						4 x 2 8
//						4 x 3 12
//						4 x 4 16
//						4 x 5 20
//						*********************
//						5 x 0 0
//						5 x 1 5
//						5 x 2 10
//						5 x 3 15
//						5 x 4 20
//						5 x 5 25					
						
					}
					
				}

	}

}
