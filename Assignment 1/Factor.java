import java.util.Scanner;

class Factor{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		System.out.println("\nFactors of "+ num + " is/are: " );
		
		for (int i=1; i<=num;i++){
			
			if (num%i == 0){			
				System.out.println(i);
			}
		}
	}
}