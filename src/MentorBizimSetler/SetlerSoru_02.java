package MentorBizimSetler;

import java.util.HashSet;

public class SetlerSoru_02 {

	
    /*
    main method altinda bos bir hashset olusturunuz.
    parametresi Integer set ve integer array ve adi elementEkle
    olan bir method yaziniz (return tipi olmayacak)
    yine set icindekileri yazdiracak ayrica bir metod daha yaziniz.
     */
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
		
		elementEkle(hs, arr);
		elementYazdir(hs);

	}

	public static void elementYazdir(HashSet<Integer> hs) {
	
		System.out.println(hs);
		
	}

	public static void elementEkle(HashSet<Integer> hs, int[] arr) {
		
		for (Integer each : arr) {
			
			hs.add(each);
			
		}
		
	}

	

}
