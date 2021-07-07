package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList07 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5, 1, 2, 4, 3, 5, 1, 6, 7, 1, 2, 4, 6, 2, };
		// verilen array deki tekrarl� elemanlar� silip, tekrars�z bir array olu�turmak
		// istiyoruz
		// array veya list kullanarak bunu yap�n�z

		List<Integer> yeniList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (!yeniList.contains(arr[i])) {

				yeniList.add(arr[i]);
			}

		}
		System.out.println(yeniList);//[1, 2, 3, 5, 4, 6, 7]
	}

}
