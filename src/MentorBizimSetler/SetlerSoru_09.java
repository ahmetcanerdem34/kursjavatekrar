package MentorBizimSetler;

import java.util.HashSet;

public class SetlerSoru_09 {

	public static void main(String[] args) {
	
		
		 // Soru 1 : Bir HashSet random olarak 10 adet olacak şekilde
        // 1 den 20 ye kadar olan sayılarla dolduran
        // fonksiyonu yazınız. Set i main de yazdırınız.
       
		
		// Soru 2 : Bu SET i bir fonksiyonda diziye çeviriniz.
        // main de yazdırınız bu diziyi.

       
		
		
		//HashSet<Integer> hs= new HashSet<>();--> başlangıçta oluştrumuş olduğumuz hashset, 
													//getirip sayilarlaDoldur();metodumuzu buna eşlersek deçalıştırabiliriz
													
		
		HashSet<Integer> hs=sayilarlaDoldur(10,1,20);//10 boyutlu 1 den başlayıp 20 ye kadar gider
		
		System.out.println(hs);//hs yi de burda yazdırmalıyım
		
    }

	private static HashSet<Integer> sayilarlaDoldur(int boyut, int min, int max) {//boyut 10 olacak, minimum 1 olacak, maksimum 20 olacak, bunlar int değerler
		
		HashSet<Integer> hset = new HashSet<>();
		
		//10 adet sayıdan oluşacağı için for 1 den başlayıp 10 a kadar gitmeli ve eşitlenmeli yani boyut a kadar
		for (int i = 1; i <=boyut; i++) {
			//for içerisinde çıkan her sayı yen hasset e eklenecek
			
			hset.add((int)(min + Math.random()*(max-min+1)));
			
			
		}
		return hset;
		
		
		
	}
	
	//sorunun 2. kısmı
	// Soru 2 : Bu SET i bir fonksiyonda(methodda) diziye çeviriniz.
    // main de yazdırınız bu diziyi.
		
	
	
		 
	    }
		
		
	

