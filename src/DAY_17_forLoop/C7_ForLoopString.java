package DAY_17_forLoop;

import java.util.Scanner;

public class C7_ForLoopString {

	public static void main(String[] args) {
		
		
		//Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("string giriniz :");
		String ters=scan.nextLine().toLowerCase();
		
		
		String yazi=" ";
		
		for (int i =ters.length()-1; i>0; i--) {
			
			yazi=yazi+ters.charAt(i);
			
			
		}
		
		System.out.println(yazi);
		
//		string giriniz :�al��t�k�a java da �o�u �ey yerine oturuyor
//		 royuruto enirey ye� u�o� ad avaj a�k�t��la

		scan.close();
		

	}

}
