import java.util.*;
class S14	
{  
static String remove (String s,String ch)
{
		return s=s.replaceAll(ch,""); 
}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
	     String s=sc.next();
		 String ch=sc.next();
		 System.out.println(remove(s,ch));
	
	}
}