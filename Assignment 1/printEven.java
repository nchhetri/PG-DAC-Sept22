import java.util.Scanner;

class printEven{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the range: ");
	int num = sc.nextInt();
	
	System.out.print("Even series: ");
		for (int i=1; i<=num; i++){
			
			if(i%2 ==0 ){
				System.out.print(i+" ");
			}
		}
	}
}