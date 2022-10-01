import java.util.Scanner;

class Yrs{

	void yrs(int days){
		
		int temp ;
		int yrs = days/365;
		
		temp = days - (yrs*365);
		int months = temp/30;
		
		int d = temp - (30*months);
		
		System.out.println("It is "+ yrs +" year "+months+" Month and " + d + " days." );
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		
		Yrs y = new Yrs();
		y.yrs(days);
		
	}
}