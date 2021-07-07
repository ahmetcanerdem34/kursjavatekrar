package MentorBizimSetler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class SetlerSoru_01 {
	
	  /*
    Ýcinde degerleri olan bir array i arraylist e cevirecek bir metod yaziniz.
    {"reha", "hakan", "haluk", "ipek", "ahsen"}
    return tipi arrayList olacak
    main metod altinda metod ile gelen listeyi kullanarak HashSet, TreeSet ve linkedHashSet leri doldurun.
    */


	public static void main(String[] args) {
		
		String arr[]={"reha", "hakan", "haluk", "ipek", "ahsen"};
		
	
		
		System.out.println(	yeniList(arr));
		
		
		HashSet<String> hs = new HashSet<>(Arrays.asList(arr));
		System.out.println(hs);
		
		LinkedHashSet<String> ls = new LinkedHashSet<>(Arrays.asList(arr));
		System.out.println(ls);
		
		TreeSet<String> ts = new TreeSet<>(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));
	}

	public static List<String> yeniList(String arr[]) {
		
		List<String> list = new ArrayList<>();
		
		for (String each : arr) {
			
			list.add(each);
			
		}
		
		
		return list;
		
		
	}
	
	

}
