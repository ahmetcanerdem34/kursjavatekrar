package DAY_25_arrays;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		
		//verilen bir sstringi array e �eviriniz, nas�l �eviririz
				//verilen bir c�mlede ka� kelime oldu�unu bulunuz
				//verilen c�mlede her kelimenin ilk harfini b�y�k yaz�n�z...gibi
		
		String str="Herkes javay� tan�sa severdi";
		//bu stringi kelimelere ay�ral�m
		//split(ay�rma) methodu
		//�nce bir array olu�turmal�y�z i�erisnde de string olacak
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		//[Herkes, javay�, tan�sa, severdi]
		System.out.println("*******************");
		
		String arr2[]=str.split("Java");
		System.out.println(Arrays.toString(arr2));
		String arr3[]=str.split("a");
		System.out.println(Arrays.toString(arr3));
		String arr4[]=str.split("");
		System.out.println(Arrays.toString(arr4));
//		        [Herkes javay� tan�sa severdi]
//				[Herkes j, v, y� t, n�s,  severdi]
//				[H, e, r, k, e, s,  , j, a, v, a, y, �,  , t, a, n, �, s, a,  , s, e, v, e, r, d, i]

	}

}
