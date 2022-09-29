import java.util.Scanner;

class pal{

	public static void main(String[] args){
	
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		int temp = num;
		int reverse = 0; 
		
		while (temp !=0){
			
			int rem = temp%10;
			reverse = reverse*10 + rem;
			temp /= 10;
		}
		
		if ( reverse == num){
		
			System.out.println("Pallindrome!!!");
		}
		else{
			
			System.out.println("Not a pallindrome!!!");
		}
	}
}