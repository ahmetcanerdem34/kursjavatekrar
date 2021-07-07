package DAY_12;

import java.util.Scanner;

public class C3_ÝndexOfOrnek {

	public static void main(String[] args) {
		
		
		/*
		AsagidakiString degiskenini kullanarak  konsolda A L i yazdiriniz. 
		StringpickName = "ABCDEFGHÝJKLMNOPQRSTUVWXYZ";
		*/ 
		
		

		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("bir string giriniz :");
		String pickName =sc.nextLine().toUpperCase();//"ABCDEFGHÝJKLMNOPQRSTUVWXYZ";
		
		System.out.println(pickName.substring(0,1)+" "+pickName.substring(11,12)+" "+pickName.substring(8,9));
		
//		bir string giriniz :
//			ABCDEFGHÝJKLMNOPRSTUVYZ
//			A L Ý
		
		
		System.out.println("******************************************");
		

		
	}

}
