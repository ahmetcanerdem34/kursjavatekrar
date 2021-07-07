package MentorBizimSetler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class SetlerSoru_11 {

	public static void main(String[] args) {
		
		  // Soru 1 : bir metod oluşturup bir HashSet i
        // verilen bu numaralar ile doldurunuz [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]--hashset tekrarlı elemanları almaz distinct gibi
        // bu işlemi generateSet() metodunda yapınız.mainden yazdırınız.


        // AddElements şeklinde bir metodla 1 veya 1 den fazla sayı eklenebilen metodu-- array olmaz, sayı eklenen set ler olur hashset mesela
        // yazınız.

			
		HashSet<Integer> eski= 	generateSet();
	
     	System.out.println(eski);
     	
       addElements(eski,12);//bu method içerisine eski set içerisindekileri elemanları ismiyle ekledik ve uzerine yeni sayılar koyduk
       addElements(eski,24,34,54,32,1,0,87);//bir methodu yazıp istediğimiz kadar kullanabiliyoruz
       System.out.println(eski);
		
	    }

	private static void addElements(HashSet<Integer> hs,Integer...sayi) {//(int ...a)--> bunu yazabilirz ama a ya add le eleman ekleyemem, 
															//parametreyi hashset yaparsak eleman ekleye bibilirz
															//parametresi HasSet olsunki eleman ekleyebilelim ve varrags la istediği kadar sayı eklensin
		
		hs.addAll(List.of(sayi));//--burası(List.of) olabileceği gibi, (Arraays.asList) te olabilir
		
		
	}

	private static HashSet<Integer> generateSet() {
		
		HashSet<Integer> hsYeni= new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 5, 5, 6, 7, 8)); 
		
		
		return hsYeni;
	
		
		
	}
		
		
	}


