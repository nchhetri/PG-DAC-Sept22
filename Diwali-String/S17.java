import java.util.*;
class S17
{	
static  String[] stringsort(String s1[])
{
	for(int i=0;i<s1.length;i++)
	{
		for(int j=i;j<s1.length;j++)
		{
			if(s1[i].length()>s1[j].length())
			{
				String s=s1[i];
				s1[i]=s1[j];
				s1[j]=s;
			}
		}
	}
	return s1;
}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		int i=0;
		while(i<n)
		{
	     s[i]=sc.next();
		 i++;
		}
		s=stringsort(s);
		for(String s1:s)
		{
			System.out.println(s1);
		}
		
	}
}