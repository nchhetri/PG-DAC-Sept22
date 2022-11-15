import java.util.*;
class S16
{	
static void  longestPalindrom(String s)
{
	int n=s.length();
	if(n<2)
	System.out.println(s);
	int low;
	int high;
	int maxlength=1;
	int length;
	int start=0;
	for(int i=0;i<n;i++)
	{
		low=i-1;
		high=i+1;
		while(high<n && s.charAt(i)==s.charAt(high))
		{
			high++;
		}
		while(low>=0 && s.charAt(low)==s.charAt(i))
		{
			low--;
		}
		while(high<n && low>=0 && s.charAt(low)==s.charAt(high))
		{
			low--;
			high++;
		}
		length=high-low-1;
		if(length>maxlength)
		{
			maxlength=length;
			start=low+1;
		}	
	}
	System.out.println(maxlength);
	System.out.println(s.substring(start,start+maxlength));
}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
	     String s1=sc.next();
		 longestPalindrom(s1);
		
	}
}