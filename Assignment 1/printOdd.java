import java.util.Scanner;

class printOdd{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the range: ");
	int num = sc.nextInt();
	
	System.out.print("Odd series: ");
		for (int i=1; i<=num; i++){
			
			if(i%2 != 0 ){
				System.out.print(i+" ");
			}
		}
	}
}