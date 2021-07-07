package DAY_25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {

		int arr[] = { 3, 10, 16, 25, 75 };// aþaðýda burada 25 var mý yazdýralým

		int sayi = 25;// verilen bir array de bir eleamnýn var olup olmadýðýný nasýl kontrol
						// edebiliriz

		// true yaa da false durumu olduðu için flag kullanýyorduk
		
		boolean flag=false;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==25) {
				flag=true;
				
				
			}
	}
		if(flag) {
			System.out.println("içeriyor");
		}else {
			System.out.println("içermiyor");
		}
		System.out.println("***********************");
		//arrays methodundan method kullanarak yapalým
		
		System.out.println(Arrays.binarySearch(arr, 25));//3-->3. indexte
		System.out.println(Arrays.binarySearch(arr, 5));//-2-->olsaydý length 2 de olacaktý
		System.out.println(Arrays.binarySearch(arr, 75));//4-->4.indexte
		        //binary.search aradýðýmýz eleman varsa indexini verir, 
				//aradýðýnýz eleman yoksa  -iþrareti ile olsaydý kaçýncý eleman olacaðýnýn  sýrasýný veriri
		System.out.println("********************");
		
		int arr2[]= {12,15,25,14,3,22,65};
		
		System.out.println(Arrays.binarySearch(arr2,22));//5
		System.out.println(Arrays.binarySearch(arr2, 14));//3
		System.out.println(Arrays.binarySearch(arr2, -5));//-1
		
		//Array nasýl String e çevrilir
		
		String stringArray=Arrays.toString(arr2);
		System.out.println(stringArray);
		System.out.println(stringArray.substring(8));
		// 25, 14, 3, 22, 65]--->8. indexten sonrasýný yazdýr
		
	}
}
