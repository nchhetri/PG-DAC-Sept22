import java.util.Scanner;

class swap{

	public static void main(String[] Args){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter first number: ");
	int num1 = sc.nextInt();
		
	System.out.println("Enter second number");
	int num2 = sc.nextInt();
	
	num1 = num1+num2;
	num2 = num1 - num2;
	num1 = num1 - num2;
	
	System.out.println("\nNum1: " + num1 + "\nNum2: " +num2);
	
	}
}