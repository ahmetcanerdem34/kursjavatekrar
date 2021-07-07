package DAY_24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_04Ornek {

	public static void main(String[] args) {
	
		//kullanýcýdan deðerler alarak bir int array oluþturun
				//ben kullanýcýnýn kaç deðer gireceðini bilmiyorum
				//kaç deðer gireceðini alalým önce
				//onun için deðerler almadan önce uzunluðunu almam lazým
				//ona göre for da yapalým
				
				Scanner scan=new Scanner (System.in);
				System.out.println("diiznin kaç elemandan olacaðýný giirniz :");
				int uzunluk=scan.nextInt();
				
				int arr[]= new int[uzunluk];
				System.out.println("lütfen sayýlarý giriniz");
				
				for (int i = 0; i < arr.length; i++) {
					
					arr[i]=scan.nextInt();
					
				}
				System.out.println(Arrays.toString(arr));
//				diiznin kaç elemandan olacaðýný giirniz :
//					7
//					lütfen sayýlarý giriniz
//					34
//					32
//					32
//					434
//					55
//					44
//					32
//					[34, 32, 32, 434, 55, 44, 32]

	}

}
