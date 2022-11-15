import java.util.*;
class S13
{
	static void duplicate(String s)
	{
		int c1;
		int c2=0;
		char c=0;
		
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			 c1=0;
		  for(int j=0;j<a.length;j++)
		  {
			  if(a[j]!=0)
				  {
				  if(a[i]==a[j])
				 {
					c1++;	 
				  if(i!=j)
					  {
						  a[j]=0;
					  }
			  }
			  }
			  if(c1>c2)
			  {
				  c2=c1;
			   c=a[i];  
			  }
		  }
		}
		System.out.println(c);
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
	     String s=sc.next();
		duplicate(s);
	}
}