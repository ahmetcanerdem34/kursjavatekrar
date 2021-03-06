package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {


		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(35);
		
		List<Integer> list2=new ArrayList<>();
		
		list2.add(56);
		list2.add(67);
		list2.add(865);
		
		System.out.println(list1.equals(list2));//false
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1);//[10, 20, 35]
		System.out.println(list2);//[56, 67, 865]
		
		list1.clear();
		System.out.println(list1);//[]


	}

}
