package DAY_25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		 // Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
        // Array olusturulurken 2 seyi declare etmeliyiz: 1- data type (Bir array'in icerisinde 
        // sadece ayni data tipinden elemanlar olabilir.) 2- uzunluk (uzunluk array'in icerisne konulacak m
        // max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)

		int arr []= {10,23,54}; // length =3
        String isimler[]=new String[4]; // length=4 olan bos bir array olusturur
        isimler[0]="Ali";
        isimler[3]="Veli";
        isimler[1]="Ayþe";
        System.out.println(Arrays.toString(isimler));
        //[Ali, null, null, Veli]
        System.out.println("****************");
        System.out.println(isimler[3]);//Veli
        System.out.println(isimler[2]);//null
       System.out.println(isimler[1]);//Ayþe
        
        System.out.println("*********************");
        
        for (int i = 0; i < isimler.length; i++) {
        	
        	System.out.print(isimler[i]+" ");//Ali Ayþe null Veli 
			
		}
        
        System.out.println();
        // Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
        // Mesela isimler array'inin icinde isim degerleri degil, isimlerin referanslari olur
        
        
      
        System.out.println(Arrays.toString(isimler));
        //Ali Ayþe null Veli
	}

}
