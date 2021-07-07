package DAY_24_arrays;

import java.util.Arrays;

public class Arrays_01 {

	public static void main(String[] args) {
		
		//ayn� t�rden verileri kal�p olarak tutan veri yap�lar�na array denir
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		String isim="Ali";
//java da 1 den fazla eleman� koyabilece�imiz(store)objectler var�dr, ilkini g�rece�iz

		//Array bir objedir
		
		int arr[]= {10,20,30};
		
		System.out.println(arr.length);//bu dizinin length i 3 tur, 
		System.out.println(arr);//Array bir obje oldu�u i�in bu �ekilde yazmak hata verir
								//yazd�rmak istedi�imizde java referans� kulan�r
		System.out.println(Arrays.toString(arr));
		//[10, 20, 30]
								
		System.out.println(arr.length-1);//2 sonucunu verir
		
		System.out.println("********************");
		String takim[] = new String[7];
		System.out.println(Arrays.toString(takim));
		//[null, null, null, null, null, null, null]
		//i�erisinde de�er olmad��� i�in string null verir, int olsa 0 verirdi
		
		takim[2]="Hasan";
		takim[1]="Veli";
		takim[3]="Mehmet";//Array i�ini 3 e �evirim
		System.out.println(Arrays.toString(takim));
		//[null, Veli, Hasan, null, null, null, null]
		
		takim[3]="Mehmet";//Array i�ini 3 e �evirip yeniden yazd�ral�m tak�m array�ini
		//System.out.println(Arrays.toString(takim));
		//ArrayIndexOutOfBoundsException
		
		System.out.println("*****************");
		
		//Arrayde bir eleman� update etmek isteyelim
		
		takim[1]="Kemal";
		takim[6]="Victor";
		takim[5]="�Z�L";
		System.out.println(Arrays.toString(takim));
		//[null, Kemal, Hasan, Mehmet, null, �Z�L, Victor]
		
		//tak�m�n uzunlu�unu yazd�ral�m
		System.out.println(takim.length);//7
		
		System.out.println("********************");
		//Arraydeki son eleman� Hagi yapal�m
		
		takim[takim.length-1]="Hagi";
		System.out.println(Arrays.toString(takim));
		//[null, Kemal, Hasan, Mehmet, null, �Z�L, Hagi]
		System.out.println("***************");
		
		//orta eleman� Can yapal�m
		
		if(takim.length%2==1) {
			int orta�ndex=(takim.length-1)/2;
			
			takim[orta�ndex]="Can";
			System.out.println(Arrays.toString(takim));
			//[null, Kemal, Hasan, Can, null, �Z�L, Hagi]
			
		}
		
		

	}

}
