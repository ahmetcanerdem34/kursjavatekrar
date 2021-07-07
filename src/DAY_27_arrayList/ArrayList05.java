package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
	
		
		//verilen bir Array i list e nas�l �evirebiliriz
		//bir array olu�tural�m====peki listte �evirmek ne i�e mize yarar, baz� methodlar� kullanabilriz
		
		String arr[]= {"Ahmet","Kemal"};
		//liste �evirmek istiyorsak �nce bir list olu�turmal�y�m
		
		List<String> list= Arrays.asList(arr);
		
		System.out.println(list);//[Ahmet, Kemal]

		System.out.println("**********************");
		
		int arr1[]= {4,3,6,7,8,4,3,5,6};
		arr1[1]=5;//1. index e 5 i atad�k
		System.out.println(Arrays.toString(arr1));
		
	
		list.set(0, "Kaz�m");
		System.out.println(list);
		//[Kaz�m, Kemal]
		
		System.out.println(Arrays.toString(arr));//[Kaz�m, Kemal]
		
		
	}

}
