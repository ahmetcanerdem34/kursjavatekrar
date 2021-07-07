package DAY_25_arrays;

import java.util.Arrays;

public class Calisma_Array1 {

	public static void main(String[] args) {
		
		
		int arr[]= {10,23,54};
		System.out.println(Arrays.toString(arr));
		
		
		String isimler[]= new String[4];
		isimler[0]="Ahmet";
		isimler[1]="Mahmut";
		isimler[2]="Mustafa";
		isimler[3]="Kamil";
		
		System.out.println(Arrays.toString(isimler));//[Ahmet, Mahmut, Mustafa, Kamil]
		System.out.println(isimler);
		//[Ljava.lang.String;@368102c8
		System.out.println("********************");
		
		for (int i =0; i < isimler.length; i++) {
			
			System.out.println(Arrays.toString(isimler));
//			        [Ahmet, Mahmut, Mustafa, Kamil]
//					[Ahmet, Mahmut, Mustafa, Kamil]
//					[Ahmet, Mahmut, Mustafa, Kamil]
//					[Ahmet, Mahmut, Mustafa, Kamil]
			
		}
		
		System.out.println("*******************");
		//karýþýk þekilde  verilen String isimler dizisini sýralayalým
		
		String isimler2[]= new String[4];
		isimler2[3]="Kamil";
		isimler2[0]="Ahmet";
		isimler2[2]="Mustafa";
		isimler2[1]="Mahmut";
		
		Arrays.sort(isimler2);
		
		System.out.println(Arrays.toString(isimler2));//[Ahmet, Kamil, Mahmut, Mustafa]
		System.out.println(isimler[3]);//Kamil
		
		
		
		

	}

}
