import java.util.Scanner;

class Percent{
	
		int per(int a,int b,int c,int d,int e){
			return ((a+b+c+d+e)/5);
		}
	
	public static void main(String[] atrgs){
	
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("*****************Enter Subject wise marks*****************");
		System.out.println();
		
		System.out.print("English: ");
		int eng = sc.nextInt();
		
		System.out.print("Hindi: ");
		int hin = sc.nextInt();
		
		System.out.print("Maths: ");
		int mth = sc.nextInt();
		
		System.out.print("Science : ");
		int sci = sc.nextInt();
		
		System.out.print("SST: ");
		int sst = sc.nextInt();
		
		
		Percent p = new Percent();
		
		System.out.println("\nPercentage marks = "+p.per(eng, hin, mth, sci, sst )+" % ");
	}
}