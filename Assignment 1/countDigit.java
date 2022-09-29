import java.util.Scanner;

class countDigit{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		int count=0;
		int a = num;
		while ( a != 0 ){
			
			a /= 10;
			count++;
		}
		System.out.println("Digit count is: "+count);
	}
}