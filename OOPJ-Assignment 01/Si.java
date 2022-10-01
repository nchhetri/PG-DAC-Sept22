import java.util.Scanner;

class Si{

	int simI(int p, int r, int t){
		
		return ((p*r*t)/100);
	}

	public static void main(String[] args){
		System.out.println("**************Enter the below mentioned details**************");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Principal amount (in RS.): ");
		int pa = sc.nextInt();
		
		System.out.print("Interest rate: ");
		int ir = sc.nextInt();
		
		System.out.print("Time duration (in years): ");
		int td = sc.nextInt();
		
		
		Si sObj = new Si();
		System.out.println("Simple Interest: "+sObj.simI(pa,ir,td));
	}

}