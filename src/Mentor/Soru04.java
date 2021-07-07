package Mentor;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru04 {

	public static void main(String[] args) {
		
		/*
	    Problem Tan�m� :
	    parametre olarak Integer Arraylist alan ve return type int olan hillNum isminde br method yaz�n�z
	    method ; kendinden �nceki say�dan k���k kendinden sonrakinden b�y�k olan say�y� yazd�rs�n
	    Test data:
	    input : ArrayList 5,4,6,2,1
	    output : 2
	    2; 6 dan k���k 1 den b�y�k
	     */
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,4,6,2,1));
		
		
		
		System.out.println(hillNum(list));
		
	}

	public static int hillNum(ArrayList<Integer> list) {
		
		int hillNum=0;
		
		
		for (int i= 1; i <list.size()-1; i++) {
			
			if(list.get(i)<list.get(i-1) && list.get(i)>list.get(i+1)) {
				
				hillNum=list.get(i);
				
			}
			
		}
		
	
		return hillNum;
	}

}
