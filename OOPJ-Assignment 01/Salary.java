import java.util.Scanner;

class Salary{

	int salBelow(int sal){
		int hra = ((sal*10)/100);
		int da = ((sal*90)/100);
		return (sal+hra+da);
	}
	
	int salAbove(int sal){
		int hra = 2000;
		int da = (sal*98)/100;
		return (sal+hra+da);
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter your Salary: ");
		int sal = sc.nextInt();
		
		
		Salary s = new Salary();
		
		if (sal<10000){
			
			System.out.println("Your Gross Salary is: Rs "+s.salBelow(sal));
		}
		else{
			
			System.out.println("Your Gross Salary is: Rs "+s.salAbove(sal));
		}
		
	}
}