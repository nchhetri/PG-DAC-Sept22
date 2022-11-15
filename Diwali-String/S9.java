import java.util.*;
class S9
{
	static void permetuation(String s1,String s2)
	{
		if(s1.length()==0)
			System.out.println(s2);
		else
			for(int i=0;i<s1.length();i++)
			{
			char r1=s1.charAt(i);
			String r2=s1.substring(0,i)+s1.substring(i+1);
			permetuation(r2,s2+r1);
			}
			
	}

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		permetuation(s,"");

	}
}