package DAY_17_forLoop;

import java.util.Scanner;

public class C1_ForLoopCalisma01 {

	public static void main(String[] args) {
		
		//KULLANICIDAN POZ�T�F 2 TAM SAYI ALIN 
		//ald���m�z de�erlerden kucuk olandan ba�lay�p buyuk olana kadar 
		//t�m say�lar� yan yana , ile ay�rarak yazd��rn�z
		
		Scanner scan=new Scanner (System.in);
		
		
			System.out.println("say� giriniz :");
			int sayi1=scan.nextInt();
			int sayi2=scan.nextInt();
			
			if(sayi1<=0 || sayi2<=0) {
				
				System.out.println("pozi say� giriniz :");
				
			}else if (sayi1>sayi2) {
				
				for (int i = sayi2; i <=sayi1; i++) {
					
					System.out.print(i+" ");
//					say� giriniz :
//						10
//						20
//						10 11 12 13 14 15 16 17 18 19 20
					
				}
			}else if (sayi2>sayi1) {
					
					for (int i = sayi1; i <=sayi2; i++) {
						System.out.print(i+" ");
//						say� giriniz :
//							21
//							12
//							12 13 14 15 16 17 18 19 20 21 
						scan.close();
						
					}
					
				}
			}
	
			
		}
		
	

	


