package DAY_25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {

		int arr[] = { 3, 10, 16, 25, 75 };// a�a��da burada 25 var m� yazd�ral�m

		int sayi = 25;// verilen bir array de bir eleamn�n var olup olmad���n� nas�l kontrol
						// edebiliriz

		// true yaa da false durumu oldu�u i�in flag kullan�yorduk
		
		boolean flag=false;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==25) {
				flag=true;
				
				
			}
	}
		if(flag) {
			System.out.println("i�eriyor");
		}else {
			System.out.println("i�ermiyor");
		}
		System.out.println("***********************");
		//arrays methodundan method kullanarak yapal�m
		
		System.out.println(Arrays.binarySearch(arr, 25));//3-->3. indexte
		System.out.println(Arrays.binarySearch(arr, 5));//-2-->olsayd� length 2 de olacakt�
		System.out.println(Arrays.binarySearch(arr, 75));//4-->4.indexte
		        //binary.search arad���m�z eleman varsa indexini verir, 
				//arad���n�z eleman yoksa  -i�rareti ile olsayd� ka��nc� eleman olaca��n�n  s�ras�n� veriri
		System.out.println("********************");
		
		int arr2[]= {12,15,25,14,3,22,65};
		
		System.out.println(Arrays.binarySearch(arr2,22));//5
		System.out.println(Arrays.binarySearch(arr2, 14));//3
		System.out.println(Arrays.binarySearch(arr2, -5));//-1
		
		//Array nas�l String e �evrilir
		
		String stringArray=Arrays.toString(arr2);
		System.out.println(stringArray);
		System.out.println(stringArray.substring(8));
		// 25, 14, 3, 22, 65]--->8. indexten sonras�n� yazd�r
		
	}
}
