import java.util.*;
class S2
{
    static void anagrams(String s1,String s2)
	{
		int i;
		char c1[]=s1.toCharArray();
		char  c2[]=s2.toCharArray();
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
			System.out.println("given string is anagrams of each other");
		else
			System.out.println("given string is not anagrams of each other");
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
	    String s1=sc.next();
		String s2=sc.next();
		 anagrams(s1,s2);

	}
}