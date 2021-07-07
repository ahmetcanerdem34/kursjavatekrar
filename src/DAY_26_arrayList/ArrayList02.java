package DAY_26_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		//listin uzunlu�u nas�l bulunur
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(45);
		list.add(32);
		list.add(56);
		System.out.println(list);//[20, 45, 32, 56]
		System.out.println(list.size());//4
		
		list.add(3, 67);
		System.out.println(list);//[20, 45, 32, 67, 56]
		System.out.println(list.size());//5
		
		list.remove(4);
		System.out.println(list);//[20, 45, 32, 67]
		System.out.println(list.size());//4
		System.out.println("********************");
		System.out.println(list.remove(2));//32-->silece�i eleman� bize gisrer
		System.out.println(list);//[20, 45, 67]-->g�sterdi�i eleman� silmi� olur
		
		System.out.println("*************************");
		
		List<String> isim = new ArrayList<>();
		isim.add("Musa");
		isim.add("Harun");
		isim.add("S�leyman");
		isim.add("Kerim");
		System.out.println(isim);//[Musa, Harun, S�leyman, Kerim]
		
		System.out.println(isim.remove(3));//Kerim
		System.out.println(isim.remove("Kerem"));//false--->Kerem gitti bakt� yok false verdi olsa silecekti
		
	}

}
