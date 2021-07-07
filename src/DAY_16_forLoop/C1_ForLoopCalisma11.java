package DAY_16_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma11 {

	public static void main(String[] args) {
		
//      *
//     **
//    * *
//   *  *
//  *   *
// *    *
//*******

		Scanner sc=new Scanner(System.in);
		System.out.println("bir tam sayý giriniz : ");
		int boyut=sc.nextInt();
		for (int i = 0; i <= 7; i++) {
		    // bosluk icin
		    for (int j = 1; j <= 7 - i; j++)//saða dayalý olmasý için bu for yoruma alýnmalý
		        System.out.print(" ");
		    // '*' icin
		    for (int k = 1; k <= i; k++) {
		        // kenarlarda "*" yazmak icin
		        if (i == 7 || k == 1 || k == i)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
		
	}

}
