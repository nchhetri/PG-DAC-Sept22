import java.util.Scanner;

class fact{
	
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number: ");
	int num = sc.nextInt();
	int a = num;
	
	for(int i=0; i <num ; i++){
		
		a = a* (num-1);
		num--;
	}
	System.out.println(a);
	
	}	
	
}