import java.util.Scanner;

class gcd{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number: ");
	int num1 = sc.nextInt();
	
	System.out.println("Enter second number: ");
	int num2 = sc.nextInt();

	int c;
	int gcd = 1;
	
		if (num1<=num2){
			
			
			for(int i = 1;i<=num1; i++){
			
				if ((num1%i)==0 && (num2%i)==0 ){
					
					c = i;
					
					if (c>gcd){
					
						gcd =c;
					}
					
				}
				
			}
	
		}else{
			
			for(int i = 1;i<=num2; i++){
			
				if ((num2%i)==0 && (num1%i)==0 ){
					
					c = i;
					
					if (c>gcd){
					
						gcd =c;
					}
					
				}
				
			}
		
		} 
		
		System.out.println("\nHCF of "+num1+" and "+num2+" is: "+gcd);
	}
}