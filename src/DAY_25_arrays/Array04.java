package DAY_25_arrays;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		
		//iki array in eþit olduðunu kontrol etme
		
		int arr1[]= {23,34,54,5,65,76};
		int arr2[]= {45,65,67,8,89,0,98,7};
		
		System.out.println(Arrays.equals(arr1, arr2));//false
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));//[5, 23, 34, 54, 65, 76]
		System.out.println(Arrays.toString(arr2));//[0, 7, 8, 45, 65, 67, 89, 98]
		System.out.println(Arrays.equals(arr1, arr2));//false
		
		
		System.out.println("***********************");
		
		int arr3[]= {12,21,23,32,34,43,45,54,56,65};
		int arr4[]= {21,23,12,43,45,56,54,65,32,34};
		
		System.out.println(Arrays.equals(arr3, arr4));//false
		
		Arrays.sort(arr3);
		Arrays.sort(arr4);
		
		System.out.println(Arrays.toString(arr3));//[12, 21, 23, 32, 34, 43, 45, 54, 56, 65]
		System.out.println(Arrays.toString(arr4));//[12, 21, 23, 32, 34, 43, 45, 54, 56, 65]
		
		System.out.println(Arrays.equals(arr3, arr4));//true
		
		
		
	}

}
