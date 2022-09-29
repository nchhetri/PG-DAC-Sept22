import java.util.Scanner;

class posNeg{
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number: ");
	int num = sc.nextInt();
	
	if(num<0){
		System.out.println("Negative number!!!");
	}
	else
		if(num == -0){
			System.out.println("Invalid Number!!!");
		}
		else
		{
			System.out.println("Positive Number!!!");
		}
	
	
	}
}