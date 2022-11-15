import java.util.*;
class S4
{
	static void strDigit(String s)
	{
		int i;
			char c[]=s.toCharArray();
			for( i=0;i<c.length;i++)
			{
				if(Character.isDigit(c[i]))
					continue;
				else
					break;
			}
			if(i==c.length)
				System.out.println("string contains only digit");
			else
				System.out.println("string not contains only digit");
	}
	

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
	     String s=sc.next();
         strDigit(s);		 
	}
}