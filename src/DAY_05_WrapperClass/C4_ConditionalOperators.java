package DAY_05_WrapperClass;

public class C4_ConditionalOperators {

	public static void main(String[] args) {
		
		//AND && , OR ||
		
		//AND VE OR NASIL ÇALIÞIR
		
		
		
		boolean isTrue=5>4 && 7-3>0;//
		System.out.println(isTrue);//true
		

		 int x=10;
		 int y=5;
		System.out.println(x>y && 5<10 && 5*10==50 && 3<5);//true
		System.out.println(x>y && 5<10 && 5*10==50 && 3>5);//false--->3 büyüktür 5 yaptý
		System.out.println(4>6);//false
		System.out.println(x<y || x+y<0 || x*y>0);//True= veya da 1 true olsa true yazdýrmak için yeterli
		
		System.out.println(5*2==10 && 6+10==16);//true
		System.out.println(14-7==7 || 14-7==0);//true
		System.out.println((5*2==15) && (5>7));//false
		
		
		
	}

}
