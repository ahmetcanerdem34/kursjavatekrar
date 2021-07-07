package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList07 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5, 1, 2, 4, 3, 5, 1, 6, 7, 1, 2, 4, 6, 2, };
		// verilen array deki tekrarlý elemanlarý silip, tekrarsýz bir array oluþturmak
		// istiyoruz
		// array veya list kullanarak bunu yapýnýz

		List<Integer> yeniList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (!yeniList.contains(arr[i])) {

				yeniList.add(arr[i]);
			}

		}
		System.out.println(yeniList);//[1, 2, 3, 5, 4, 6, 7]
	}

}
