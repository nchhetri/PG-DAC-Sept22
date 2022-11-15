import java.util.*;
class S1
{
	static void duplicate(String s)
	{
		int c;
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			 c=0;
		  for(int j=0;j<a.length;j++)
		  {
			  if(a[j]!=0)
			  {
			  if(a[i]==a[j])
			  {
				  c++;
			  if(i!=j)
			  {
				  a[j]=0;
			  }
			  }
			  }
				  
		  }
		  if(c>1)
		  {
			  System.out.println(a[i]);

		  }
		}
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
	     String s=sc.next();
		duplicate(s);
	}
}