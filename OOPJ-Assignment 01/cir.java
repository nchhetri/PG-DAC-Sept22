import java.util.Scanner;

class cir{
	
	double pi = 3.14d;
	
	double area(int rad){
		
		return ((double)(pi*(rad*rad)));
	}
	
	double circumference(int rad){
		
		return ((double)(2*(pi*rad)));
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of radius: ");
		int r = sc.nextInt();
		
		cir c1 = new cir();
		cir c2 = new cir();
		
		System.out.println();
		System.out.println("Area of circle: "+c1.area(r));
		System.out.println("Circumference of circle: "+c2.circumference(r));
	}
	
}