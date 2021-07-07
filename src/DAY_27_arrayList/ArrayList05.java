package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
	
		
		//verilen bir Array i list e nasýl çevirebiliriz
		//bir array oluþturalým====peki listte çevirmek ne iþe mize yarar, bazý methodlarý kullanabilriz
		
		String arr[]= {"Ahmet","Kemal"};
		//liste çevirmek istiyorsak önce bir list oluþturmalýyým
		
		List<String> list= Arrays.asList(arr);
		
		System.out.println(list);//[Ahmet, Kemal]

		System.out.println("**********************");
		
		int arr1[]= {4,3,6,7,8,4,3,5,6};
		arr1[1]=5;//1. index e 5 i atadýk
		System.out.println(Arrays.toString(arr1));
		
	
		list.set(0, "Kazým");
		System.out.println(list);
		//[Kazým, Kemal]
		
		System.out.println(Arrays.toString(arr));//[Kazým, Kemal]
		
		
	}

}
