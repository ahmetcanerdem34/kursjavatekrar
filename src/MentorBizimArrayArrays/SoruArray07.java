package MentorBizimArrayArrays;

import java.util.ArrayList;
import java.util.List;

public class SoruArray07 {

	public static void main(String[] args) {
		
		/*
         * write a program to find the duplicate values of an array of integer values
         * (bir tamsay� de�erleri dizisinin yinelenen de�erlerini bulmak icin bir program yaz�n)
         * Input : {3,2,1,4,1,3,3} Output : duplicated elements :1,3
         */
		
		
		int input[]={3,2,1,4,1,3,3};
		
		List<Integer> output = new ArrayList<>();
		
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i]==input[j] && !output.contains(input[i])) {
					output.add(input[i]);
				}
				
			}
			
		}
		System.out.println(output);//[3, 1]
		
		
		
		
		
	}

}
