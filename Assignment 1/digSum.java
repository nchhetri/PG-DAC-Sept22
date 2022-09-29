import java.util.Scanner;

class digSum{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		int count=0;
		int a = num;
		while ( a != 0 ){
			
			a /= 10;
			count++;
		}
		
		int b = 0;
		for (int i = 0; i<count; i++){
			
			b += num%10;
			num /= 10 ;
		}
		
		System.out.println("Sum of digits: "+b);
		
	}
}