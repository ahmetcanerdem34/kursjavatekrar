package DAY_24_arrays;

import java.util.Arrays;

public class Arrays_01 {

	public static void main(String[] args) {
		
		//ayný türden verileri kalýp olarak tutan veri yapýlarýna array denir
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		String isim="Ali";
//java da 1 den fazla elemaný koyabileceðimiz(store)objectler varýdr, ilkini göreceðiz

		//Array bir objedir
		
		int arr[]= {10,20,30};
		
		System.out.println(arr.length);//bu dizinin length i 3 tur, 
		System.out.println(arr);//Array bir obje olduðu için bu þekilde yazmak hata verir
								//yazdýrmak istediðimizde java referansý kulanýr
		System.out.println(Arrays.toString(arr));
		//[10, 20, 30]
								
		System.out.println(arr.length-1);//2 sonucunu verir
		
		System.out.println("********************");
		String takim[] = new String[7];
		System.out.println(Arrays.toString(takim));
		//[null, null, null, null, null, null, null]
		//içerisinde deðer olmadýðý için string null verir, int olsa 0 verirdi
		
		takim[2]="Hasan";
		takim[1]="Veli";
		takim[3]="Mehmet";//Array içini 3 e çevirim
		System.out.println(Arrays.toString(takim));
		//[null, Veli, Hasan, null, null, null, null]
		
		takim[3]="Mehmet";//Array içini 3 e çevirip yeniden yazdýralým takým arrayýini
		//System.out.println(Arrays.toString(takim));
		//ArrayIndexOutOfBoundsException
		
		System.out.println("*****************");
		
		//Arrayde bir elemaný update etmek isteyelim
		
		takim[1]="Kemal";
		takim[6]="Victor";
		takim[5]="ÖZÝL";
		System.out.println(Arrays.toString(takim));
		//[null, Kemal, Hasan, Mehmet, null, ÖZÝL, Victor]
		
		//takýmýn uzunluðunu yazdýralým
		System.out.println(takim.length);//7
		
		System.out.println("********************");
		//Arraydeki son elemaný Hagi yapalým
		
		takim[takim.length-1]="Hagi";
		System.out.println(Arrays.toString(takim));
		//[null, Kemal, Hasan, Mehmet, null, ÖZÝL, Hagi]
		System.out.println("***************");
		
		//orta elemaný Can yapalým
		
		if(takim.length%2==1) {
			int ortaÝndex=(takim.length-1)/2;
			
			takim[ortaÝndex]="Can";
			System.out.println(Arrays.toString(takim));
			//[null, Kemal, Hasan, Can, null, ÖZÝL, Hagi]
			
		}
		
		

	}

}
