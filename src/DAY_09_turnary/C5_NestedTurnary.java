package DAY_09_turnary;

import java.util.Scanner;

public class C5_NestedTurnary {

	public static void main(String[] args) {


		//kullanýcýdan bir harf isteyin kucuk harf ise konsola kucuk harf
				//buyuk harf ise BUYUK  deðilse girdiðiniz karakter harf deðil yazdýrýn

				
				Scanner scan =new Scanner (System.in);
				System.out.print("harf giriniz :");
				char harf=scan.next().charAt(0);
				
				
				int y = 8;
				
				//String deneme=(y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y);
				
				
				     
					System.out.println((harf>='a' && harf <='z') || (harf>='A' && harf <='Z') ? 
								((harf>='a' && harf<='z'))?"kucuk harf" : "büyük harf" : "girdiðiniz karakter harf deðil");
					
					

//					harf giriniz :r
//					kucuk harf
	System.out.println("*******************************************************");
						//Soru5 ) Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, yoksa
						//“Uc basamakli degil” yazdirin

	
		
					Scanner scan1 =new Scanner (System.in);
					System.out.print("sayý giriniz : ");
					int sayi=scan1.nextInt();
					
					
					String num=sayi>=100 && sayi<=999 ? "3 basamaklý" : "3 basamaklý deðil";
					
					System.out.println(num);
					
//					sayý giriniz : 456
//					3 basamaklý

scan.close();


	}

}

