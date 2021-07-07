package DAY_25_arrays;

import java.util.Arrays;

public class MultiDimentionalArrays01 {

	public static void main(String[] args) {
		
		
		int arr[][]= {{1,3,5},{3,5},{5,9,11,3}};
		
		System.out.println(arr[0][2]);//5
		System.out.println(arr[1][0]);//3
		System.out.println(arr[1][1]);//5
		System.out.println(arr[2][3]);//5
		
		
		System.out.println("******************");
		
		int arr2[][]=new int[2][9];
		arr2[0][0]=1;
		arr2[0][1]=3;
		arr2[0][2]=5;
		
		System.out.println(Arrays.deepToString(arr2));//[[1, 3, 5, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0]]
		//[[1, 3, 5, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0]]
		//biz burada 2 tane out array oluþruracaðýmýz bleirttik ve 2 array içine 9 artane tane eleamn atacacýðýmýz söyledik
		//ve sadece ilk kýsma 3 eleman attým
		
		arr2[1][5]=6;
		arr2[1][8]=4;
		System.out.println(Arrays.deepToString(arr2));//[[1, 3, 5, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 6, 0, 0, 4]]
		
	}

}
