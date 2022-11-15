import java.util.*;
class S18
{	

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		s=s.replaceAll("[^a-zA-Z]"," ");
		StringBuffer s1=new StringBuffer(s);
		String s2=s1.reverse().toString();
		int b=s.compareToIgnoreCase(s2); 
		if(b==0)
		System.out.println("true");
	else
		System.out.println("false");
		
	}
}