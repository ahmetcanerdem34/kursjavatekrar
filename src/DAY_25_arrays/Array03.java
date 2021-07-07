package DAY_25_arrays;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		
		//verilen bir sstringi array e çeviriniz, nasýl çeviririz
				//verilen bir cümlede kaç kelime olduðunu bulunuz
				//verilen cümlede her kelimenin ilk harfini büyük yazýnýz...gibi
		
		String str="Herkes javayý tanýsa severdi";
		//bu stringi kelimelere ayýralým
		//split(ayýrma) methodu
		//önce bir array oluþturmalýyýz içerisnde de string olacak
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		//[Herkes, javayý, tanýsa, severdi]
		System.out.println("*******************");
		
		String arr2[]=str.split("Java");
		System.out.println(Arrays.toString(arr2));
		String arr3[]=str.split("a");
		System.out.println(Arrays.toString(arr3));
		String arr4[]=str.split("");
		System.out.println(Arrays.toString(arr4));
//		        [Herkes javayý tanýsa severdi]
//				[Herkes j, v, yý t, nýs,  severdi]
//				[H, e, r, k, e, s,  , j, a, v, a, y, ý,  , t, a, n, ý, s, a,  , s, e, v, e, r, d, i]

	}

}
