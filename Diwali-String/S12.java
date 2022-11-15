import java.util.*;
class S12
{
    static void anagrams(String s1,String s2,String s3)
	{
		int i;
		s1=s1+s2;
		char c1[]=s1.toCharArray();
		char  c2[]=s3.toCharArray();
          Arrays.sort(c1);
		  Arrays.sort(c2);
		  for(i=0;i<c1.length;i++)
		  {
			  if(c1[i]==c2[i])
				  continue;
			  else
				  break;
		  }
		if(i==c1.length)
			System.out.println("string is right shuffle of first and second string");
		else
			System.out.println("string is not right shuffle of first and second string");
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
	    String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		 anagrams(s1,s2,s3);

	}
}