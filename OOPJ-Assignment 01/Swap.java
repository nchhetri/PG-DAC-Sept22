import java.util.Scanner;

class Swap{
	
	
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		
		System.out.println();
		System.out.println("**********Swap Values are:**********");
		System.out.println();
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
	}
}