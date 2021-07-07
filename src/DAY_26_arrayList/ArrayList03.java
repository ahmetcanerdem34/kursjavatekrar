package DAY_26_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		
		//Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip, 
	       //  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz

		int arr[]= {2,3,5,3,6,4,3,6,7};
		int sayi1=6;
		int sayi2=3; 
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=6 && arr[i]!=3) {
				
				list.add(arr[i]);
			}
			
		}
		System.out.println(list);//[2, 5, 4, 7]
		
		System.out.println(list.get(0));//2
		System.out.println(list.get(3));//7
		
		
		String kitaplar[]= {"Tarih", "Biyoloji","Fen Bilgisi", "Coðrafya","Sosyoloji"};
		
		List<String> ders= new ArrayList<>();
		
		for (int i = 0; i < kitaplar.length; i++) {
			
				ders.add(kitaplar[i]);
				
				
			}
			System.out.println("Bu yýl okutulacak dersler :"+ ders);
			//Bu yýl okutulacak dersler :[Tarih, Biyoloji, Fen Bilgisi, Coðrafya, Sosyoloji]
		}
		
		
		
		

	}


