package DAY_26_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
				//bir array list nasýl oluþturulur
		
				//array list bir objedir, dolayýsýyla yeni bir tane oluþturmak için new kelimesine ihtiyaç duyarýz keywordumuz
				
				//1.yol
		
			ArrayList<String> list1 = new ArrayList<String>();
			
			ArrayList<String> list2 = new ArrayList<>();
			
			List<String> list3= new ArrayList<>();
			
			list3.add("Kayesri");
			list3.add("Giresun");
		    list3.add("Trabzon");
		    
		    System.out.println(list3);//[Kayesri, Giresun, Trabzon]
		    
		    list3.add(1, "Sivas");//1i index e sivaas ý koy demek
		    System.out.println(list3);//[Kayesri, Sivas, Giresun, Trabzon]
		    
		    list3.add(1, "Erzincan");
		    System.out.println(list3);//[Kayesri, Erzincan, Sivas, Giresun, Trabzon]
		    
		    System.out.println("**********************************");
		    
		  //Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip, 
		       //  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
			
			int arr[]= {2,3,5,3,6,4,3,6,7};
			int sayi=6;	
			
			List<Integer> yeniListe=new ArrayList<>();
			
			for (int i = 0; i < arr.length; i++) {
				
				if(arr[i]!=sayi) {
					
					yeniListe.add(arr[i]);
				}
				
			}
			System.out.println(yeniListe);//[2, 3, 5, 3, 4, 3, 7]
	}

}
