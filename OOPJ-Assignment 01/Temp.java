import java.util.Scanner;
import java.text.DecimalFormat;

class Temp{
	
	double conversion(double f){
		
		return (5*(f-32)/9);
		
	}
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit: ");
		double f = sc.nextDouble();
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Temp t = new Temp();
		
		System.out.println("Temperature in degree celsius: "+df.format(t.conversion(f))+"°c");
		System.out.println();
		
	}
}